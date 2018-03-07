package com.KozMeeN.cards.ChaosCard.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class RebithInTheBloodKhornChaosCard extends ChaosCardKhorne {

    private RebithInTheBloodKhornChaosCard(){
        name = ChaosCardKhorne.REBIRTH_IN_THE_BLOOD;
        descriptions = ChaosCardKhorne.REBIRTH_IN_THE_BLOOD_DESCRIPTIONS;
        abilityPowerCost = 2;
    }

    public static ChaosCard getCard() {
        return new RebithInTheBloodKhornChaosCard();
    }

    @Override
    public void play() {

    }
}
