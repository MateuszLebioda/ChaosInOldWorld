package com.KozMeeN.cards.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard;

public class RebithInTheBloodKhornChaosCard extends ChaosCardKhorn {

    private RebithInTheBloodKhornChaosCard(){
        name = ChaosCardKhorn.REBITH_IN_THE_BLOOD;
        descriptions = ChaosCardKhorn.REBITH_IN_THE_BLOOD_DESCRIPTIONS;
        fightUse = true;
        manaCost = 2;
    }

    public static ChaosCard getCard() {
        return new RebithInTheBloodKhornChaosCard();
    }

    @Override
    public void play() {

    }
}
