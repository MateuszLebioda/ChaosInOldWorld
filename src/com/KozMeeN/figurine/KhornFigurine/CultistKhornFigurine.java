package com.KozMeeN.figurine.KhornFigurine;

import com.KozMeeN.champions.Champion;
import com.KozMeeN.figurine.Figurine;

public class CultistKhornFigurine extends KhornFigurine {

    public CultistKhornFigurine(){
        name = KhornFigurine.CULTIST_NAME;
        champion = Champion.KHORNE_NAME;
        description = KhornFigurine.CULTIST_DESCRIPTION;
        abilityPowerCost = 1;
        damage = 0;
        armor = 1;
    }

    public static Figurine getInstance(){
        return new CultistKhornFigurine();
    }

    @Override
    public void specialEffect() {

    }
}
