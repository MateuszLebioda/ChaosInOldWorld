package com.KozMeeN.map;

import com.KozMeeN.map.BoxesOnBoard.Region;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MapOfGameTest {
 MapOfGame map;
    @Before
    public void  setUp(){
        map = new MapOfGame();
    }

    @Test
    public void correctnessMakeMap(){
        assertEquals(Region.NORSKA_NAME,map.getRegionById(Region.NORSKA_ID).getName());
        assertEquals(Region.TROLL_LAND_NAME,map.getRegionById(Region.TROLL_LAND_ID).getName());
        assertEquals(Region.KISLEV_NAME,map.getRegionById(Region.KISLEV_ID).getName());
        assertEquals(Region.EMPIRE_NAME,map.getRegionById(Region.EMPIRE_ID).getName());
        assertEquals(Region.BRETONIA_NAME,map.getRegionById(Region.BRETONIA_ID).getName());
        assertEquals(Region.ESTALIA_NAME,map.getRegionById(Region.ESTALIA_ID).getName());
        assertEquals(Region.TILEA_NAME,map.getRegionById(Region.TILEA_ID).getName());
        assertEquals(Region.BAD_LANDS_NAME,map.getRegionById(Region.BAD_LANDS_ID).getName());
        assertEquals(Region.BORDER_PRINCES_NAME,map.getRegionById(Region.BORDER_PRINCES_ID).getName());
    }

}