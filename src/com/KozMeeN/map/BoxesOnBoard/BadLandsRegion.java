package com.KozMeeN.map.BoxesOnBoard;

public class BadLandsRegion extends Region {
    BadLandsRegion(){
        name = Region.BAD_LANDS_NAME;
        conquestValue = 1;
        resistanceValue = conquestValue;
    }

    public static Region getBox(){
        return new BadLandsRegion();
    }
}
