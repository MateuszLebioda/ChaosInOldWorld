package com.KozMeeN.map.BoxesOnBoard;

public class BorderPrincesRegion extends Region {
    BorderPrincesRegion(){
        name = Region.BORDER_PRINCES_NAME;
        conquestValue = 1;
        resistanceValue = conquestValue;
    }

    public static Region getBox(){
        return new BorderPrincesRegion();
    }
}
