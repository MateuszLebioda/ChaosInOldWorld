package com.KozMeeN.map.BoxesOnBoard;

public class TileaRegion extends Region {
    TileaRegion(){
        name = Region.TILEA_NAME;
        conquestValue = 2;
        resistanceValue = conquestValue;
    }

    public static Region getBox(){
        return new TileaRegion();
    }
}
