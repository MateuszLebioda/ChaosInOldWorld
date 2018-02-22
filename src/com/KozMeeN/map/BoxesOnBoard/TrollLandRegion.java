package com.KozMeeN.map.BoxesOnBoard;

public class TrollLandRegion extends Region {
    TrollLandRegion(){
        name = Region.TROLL_LAND_NAME;
        conquestValue = 1;
        resistanceValue = conquestValue;
    }

    public static Region getBox(){
        return new TrollLandRegion();
    }
}
