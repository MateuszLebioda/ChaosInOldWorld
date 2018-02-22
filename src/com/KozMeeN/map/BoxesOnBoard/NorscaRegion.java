package com.KozMeeN.map.BoxesOnBoard;

public class NorscaRegion extends Region {
    NorscaRegion(){
        name = Region.NORSKA_NAME;
        conquestValue = 1;
        resistanceValue = conquestValue;
    }

    public static Region getBox(){
        return new NorscaRegion();
    }
}
