package com.KozMeeN.cards.ChaosCard.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class RitualMorderKhornChaosCard extends ChaosCardKhorne {

    private RitualMorderKhornChaosCard(){
        name = ChaosCardKhorne.RITUAL_MURDER;
        descriptions = ChaosCardKhorne.RITUAL_MURDER_DESCRIPTIONS;
        abilityPowerCost = 1;
    }

    public static ChaosCard getCard() {
        return new RitualMorderKhornChaosCard();
    }


    @Override
    public void play() {

    }
}
