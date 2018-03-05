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

    private final List<Region> regions = new ArrayList<>();

    /**
     * method wll create map, add every Region to map.
     */
    private void makeMap(){
        regions.add(NorscaRegion.getBox());
        regions.add(TrollLandRegion.getBox());
        regions.add(KislevRegion.getBox());
        regions.add(EmpiereRegion.getBox());
        regions.add(BretoniaRegion.getBox());
        regions.add(EstaliaRegion.getBox());
        regions.add(TileaRegion.getBox());
        regions.add(BorderPrincesRegion.getBox());
        regions.add(BadLandsRegion.getBox());
    }

    /**
     * method show us which of Regions have at least one card in boxes.
     */
    public Region getRegionById(int id){
        return regions.get(id);
    }

    public void checkAllBox(){
        for(Region list: regions){
            list.checkSlots();
        }
    }

    public List<Region> getAllRegions(){
        return regions;
    }
}
