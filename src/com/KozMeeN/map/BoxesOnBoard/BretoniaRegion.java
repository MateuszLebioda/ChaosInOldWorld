package com.KozMeeN.map.BoxesOnBoard;

public class BretoniaRegion extends Region {
    BretoniaRegion(){
        name = Region.BRETONIA_NAME;
        conquestValue = 3;
        resistanceValue = conquestValue;
        populous = true;
    }

    public static Region getBox(){
        return new BretoniaRegion();
    }
}
