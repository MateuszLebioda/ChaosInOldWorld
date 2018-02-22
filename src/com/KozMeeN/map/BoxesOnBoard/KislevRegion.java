package com.KozMeeN.map.BoxesOnBoard;

public class KislevRegion extends Region {
    KislevRegion(){
        name = Region.KISLEV_NAME;
        conquestValue = 3;
        resistanceValue = conquestValue;
        populous = true;
    }

    public static Region getBox(){
        return new KislevRegion();
    }
}
