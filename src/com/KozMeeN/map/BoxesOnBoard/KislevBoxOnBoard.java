package com.KozMeeN.map.BoxesOnBoard;

public class KislevBoxOnBoard extends BoxOnBoard {
    KislevBoxOnBoard(){
        name = BoxOnBoard.KISLEV;
        conquestValue = 3;
        resistanceValue = conquestValue;
        populous = true;
    }

    public static BoxOnBoard getBox(){
        return new KislevBoxOnBoard();
    }
}
