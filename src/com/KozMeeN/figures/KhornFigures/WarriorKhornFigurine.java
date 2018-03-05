package com.KozMeeN.figures.KhornFigures;

import com.KozMeeN.champions.Champion;
import com.KozMeeN.figures.Figurine;

public class WarriorKhornFigurine extends KhornFigurine {

    public WarriorKhornFigurine(){
        name = KhornFigurine.WARRIOR_NAME;
        champion = Champion.KHORN_NAME;
        description = KhornFigurine.WARRIOR_DESCRIPTION;
        abilityPowerCost = 2;
        damage = 2;
        armor = 1;
    }

    public static Figurine getInstance(){
        return new WarriorKhornFigurine();
    }

    @Override
    public void specialEffect() {

    }
}
