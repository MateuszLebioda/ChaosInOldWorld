package com.KozMeeN.figurine.NurgleFigurine;

import com.KozMeeN.champions.Champion;
import com.KozMeeN.figurine.Figurine;

public class CultistNurgleFigurine extends NurgleFigurine {
    public CultistNurgleFigurine(){
        name = NurgleFigurine.CULTIST_NAME;
        champion = Champion.NURGLE_NAME;
        description = NurgleFigurine.CULTIST_DESCRIPTION;
        abilityPowerCost = 1;
        damage = 0;
        armor = 1;
    }
    public static Figurine getInstance(){
        return new CultistNurgleFigurine();
    }


    @Override
    public void specialEffect() {

    }
}
