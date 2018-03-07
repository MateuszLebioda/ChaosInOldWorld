package com.KozMeeN.figurine.NurgleFigurine;

import com.KozMeeN.champions.Champion;
import com.KozMeeN.figurine.Figurine;

public class WarriorNurgleFigure extends NurgleFigurine {
    public WarriorNurgleFigure(){
        name = NurgleFigurine.WARRIOR_NAME;
        champion = Champion.NURGLE_NAME;
        description = NurgleFigurine.WARRIOR_DESCRIPTION;
        abilityPowerCost = 1;
        damage = 1;
        armor = 1;
    }
    public static Figurine getInstance(){
        return new WarriorNurgleFigure();
    }


    @Override
    public void specialEffect() {

    }
}
