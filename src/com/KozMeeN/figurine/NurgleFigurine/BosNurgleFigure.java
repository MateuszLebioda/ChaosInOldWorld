package com.KozMeeN.figurine.NurgleFigurine;

import com.KozMeeN.champions.Champion;
import com.KozMeeN.figurine.Figurine;

public class BosNurgleFigure extends NurgleFigurine {
    public BosNurgleFigure(){
        name = NurgleFigurine.BOS_NAME;
        champion = Champion.NURGLE_NAME;
        description = NurgleFigurine.BOS_DESCRIPTION;
        abilityPowerCost = 3;
        damage = 3;
        armor = 3;
    }
    public static Figurine getInstance(){
        return new BosNurgleFigure();
    }

    @Override
    public void specialEffect() {

    }
}
