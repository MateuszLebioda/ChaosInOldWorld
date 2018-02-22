package com.KozMeeN.map.BoxesOnBoard;

public class BretoniaBoxOnBoard extends BoxOnBoard {
    BretoniaBoxOnBoard(){
        name = BoxOnBoard.BRETONIA;
        conquestValue = 3;
        resistanceValue = conquestValue;
        populous = true;
    }

    public static BoxOnBoard getBox(){
        return new BretoniaBoxOnBoard();
    }
}
