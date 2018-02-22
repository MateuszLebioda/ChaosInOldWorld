package com.KozMeeN.map;

import com.KozMeeN.map.BoxesOnBoard.*;

import java.util.ArrayList;
import java.util.List;

/**
 * class where we will have all boxes of map
 */
public class MapOfGame {
    public MapOfGame(){
        makeMap();
    }

    public List<BoxOnBoard> boxesOnBoard = new ArrayList<>();

    private void makeMap(){
        boxesOnBoard.add(NorscaBoxOnBoard.getBox());
        boxesOnBoard.add(TrollLandBoxOnBoard.getBox());
        boxesOnBoard.add(KislevBoxOnBoard.getBox());
        boxesOnBoard.add(EmpiereBoxOnBoard.getBox());
        boxesOnBoard.add(BretoniaBoxOnBoard.getBox());
        boxesOnBoard.add(EstaliaBoxOnBoard.getBox());
        boxesOnBoard.add(TileaBoxOnBoard.getBox());
        boxesOnBoard.add(BorderPrincesBoxOnBoard.getBox());
        boxesOnBoard.add(BadLandsBoxOnBoard.getBox());

    }
}
