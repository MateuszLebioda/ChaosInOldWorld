package com.KozMeeN.map.BoxesOnBoard;

public class TileaBoxOnBoard extends BoxOnBoard {
    TileaBoxOnBoard(){
        name = BoxOnBoard.TILEA;
        conquestValue = 2;
        resistanceValue = conquestValue;
    }

    public static BoxOnBoard getBox(){
        return new TileaBoxOnBoard();
    }
}
