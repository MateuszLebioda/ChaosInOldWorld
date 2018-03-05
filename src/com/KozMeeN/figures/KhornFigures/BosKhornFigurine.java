package com.KozMeeN.figures.KhornFigures;

import com.KozMeeN.champions.Champion;
import com.KozMeeN.figures.Figurine;

public class BosKhornFigurine extends KhornFigurine {

    public BosKhornFigurine(){
        name = KhornFigurine.BOS_NAME;
        champion = Champion.KHORN_NAME;
        description = KhornFigurine.BOS_DESCRIPTION;
        abilityPowerCost = 3;
        damage = 4;
        armor = 3;
    }

    public static Figurine getInstance(){
        return new BosKhornFigurine();
    }
    @Override
    public void specialEffect() {

    }
}
