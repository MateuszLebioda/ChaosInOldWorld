package com.KozMeeN.map.BoxesOnBoard;

public class BadLandsBoxOnBoard extends BoxOnBoard {
    BadLandsBoxOnBoard(){
        name = BoxOnBoard.BAD_LANDS;
        conquestValue = 1;
        resistanceValue = conquestValue;
    }

    public static BoxOnBoard getBox(){
        return new BadLandsBoxOnBoard();
    }
}
