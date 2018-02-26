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

    private final List<Region> boxesOnBoard = new ArrayList<>();

    /**
     * method wll create map, add every Region to map.
     */
    private void makeMap(){
        boxesOnBoard.add(NorscaRegion.getBox());
        boxesOnBoard.add(TrollLandRegion.getBox());
        boxesOnBoard.add(KislevRegion.getBox());
        boxesOnBoard.add(EmpiereRegion.getBox());
        boxesOnBoard.add(BretoniaRegion.getBox());
        boxesOnBoard.add(EstaliaRegion.getBox());
        boxesOnBoard.add(TileaRegion.getBox());
        boxesOnBoard.add(BorderPrincesRegion.getBox());
        boxesOnBoard.add(BadLandsRegion.getBox());
    }

    /**
     * method show us which of Regions have at least one card in boxes.
     */
    public Region getRegionById(int id){
        return boxesOnBoard.get(id);
    }

    public void checkAllBox(){
        for(Region list:boxesOnBoard){
            list.checkSlots();
        }
    }
}
