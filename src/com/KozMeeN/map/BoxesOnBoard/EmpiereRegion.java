package com.KozMeeN.map.BoxesOnBoard;

public class EmpiereRegion extends Region {
    EmpiereRegion(){
        name = Region.EMPIRE_NAME;
        conquestValue = 5;
        resistanceValue = conquestValue;
        populous = true;
    }

    public static Region getBox(){
        return new EmpiereRegion();
    }
}
