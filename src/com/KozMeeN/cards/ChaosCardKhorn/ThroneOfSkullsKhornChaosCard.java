package com.KozMeeN.cards.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard;

public class ThroneOfSkullsKhornChaosCard extends ChaosCardKhorn {

    private ThroneOfSkullsKhornChaosCard(){
        name = ChaosCardKhorn.THRONE_OF_SKULLS;
        descriptions = ChaosCardKhorn.THRONE_OF_SKULLS_DESCRIPTIONS;
        dominationUse = true;
        manaCost = 1;
    }

    public static ChaosCard getCard() {
        return new ThroneOfSkullsKhornChaosCard();
    }

    @Override
    public void play() {

    }
}