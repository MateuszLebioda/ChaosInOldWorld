package com.KozMeeN.figurine.KhornFigurine;

import com.KozMeeN.champions.Champion;
import com.KozMeeN.figurine.Figurine;

public class BosKhornFigurine extends KhornFigurine {
    public BosKhornFigurine(){
        name = KhornFigurine.BOS_NAME;
        champion = Champion.KHORNE_NAME;
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
