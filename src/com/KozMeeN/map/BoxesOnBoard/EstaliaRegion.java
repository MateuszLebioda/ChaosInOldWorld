package com.KozMeeN.map.BoxesOnBoard;

public class EstaliaRegion extends Region {
    EstaliaRegion(){
        name = Region.ESTALIA_NAME;
        conquestValue = 4;
        resistanceValue = conquestValue;
        populous = true;
    }


    public static Region getBox(){
        return new EstaliaRegion();
    }
}
