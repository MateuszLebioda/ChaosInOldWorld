package com.KozMeeN.map.BoxesOnBoard;

public class NorscaBoxOnBoard extends BoxOnBoard {
    NorscaBoxOnBoard(){
        name = BoxOnBoard.NORSKA;
        conquestValue = 1;
        resistanceValue = conquestValue;
    }

    public static BoxOnBoard getBox(){
        return new NorscaBoxOnBoard();
    }
}
