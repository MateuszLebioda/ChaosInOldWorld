package com.KozMeeN.map.BoxesOnBoard;

public class EmpiereBoxOnBoard extends BoxOnBoard {
    EmpiereBoxOnBoard(){
        name = BoxOnBoard.EMPIRE;
        conquestValue = 5;
        resistanceValue = conquestValue;
        populous = true;
    }

    public static BoxOnBoard getBox(){
        return new EmpiereBoxOnBoard();
    }
}
