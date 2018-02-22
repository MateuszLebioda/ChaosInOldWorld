package com.KozMeeN.map.BoxesOnBoard;

public class BorderPrincesBoxOnBoard extends BoxOnBoard {
    BorderPrincesBoxOnBoard(){
        name = BoxOnBoard.BORDER_PRINCES;
        conquestValue = 1;
        resistanceValue = conquestValue;
    }

    public static BoxOnBoard getBox(){
        return new BorderPrincesBoxOnBoard();
    }
}
