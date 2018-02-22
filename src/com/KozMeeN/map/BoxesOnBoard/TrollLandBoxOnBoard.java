package com.KozMeeN.map.BoxesOnBoard;

public class TrollLandBoxOnBoard extends BoxOnBoard {
    TrollLandBoxOnBoard(){
        name = BoxOnBoard.TROLL_LAND;
        conquestValue = 1;
        resistanceValue = conquestValue;
    }

    public static BoxOnBoard getBox(){
        return new TrollLandBoxOnBoard();
    }
}
