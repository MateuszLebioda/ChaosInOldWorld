package com.KozMeeN.cards.ChaosCard.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class ThroneOfSkullsKhornChaosCard extends ChaosCardKhorne {

    private ThroneOfSkullsKhornChaosCard(){
        name = ChaosCardKhorne.THRONE_OF_SKULLS;
        descriptions = ChaosCardKhorne.THRONE_OF_SKULLS_DESCRIPTIONS;
        abilityPowerCost = 1;
    }

    public static ChaosCard getCard() {
        return new ThroneOfSkullsKhornChaosCard();
    }

    @Override
    public void play() {

    }
}
