package com.KozMeeN.cards.ChaosCard.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class RebithInTheBloodKhornChaosCard extends ChaosCardKhorn {

    private RebithInTheBloodKhornChaosCard(){
        name = ChaosCardKhorn.REBIRTH_IN_THE_BLOOD;
        descriptions = ChaosCardKhorn.REBIRTH_IN_THE_BLOOD_DESCRIPTIONS;
        fightUse = true;
        abilityPowerCost = 2;
    }

    public static ChaosCard getCard() {
        return new RebithInTheBloodKhornChaosCard();
    }

    @Override
    public void play() {

    }
}
