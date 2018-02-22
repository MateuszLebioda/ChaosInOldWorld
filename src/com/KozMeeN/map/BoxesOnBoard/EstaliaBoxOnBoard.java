package com.KozMeeN.map.BoxesOnBoard;

public class EstaliaBoxOnBoard extends BoxOnBoard {
    EstaliaBoxOnBoard(){
        name = BoxOnBoard.ESTALIA;
        conquestValue = 4;
        resistanceValue = conquestValue;
        populous = true;
    }


    public static BoxOnBoard getBox(){
        return new EstaliaBoxOnBoard();
    }
}
