package com.KozMeeN.cards.ChaosCard.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class WarCryKhornChaosCard extends ChaosCardKhorne {

    private WarCryKhornChaosCard(){
        name = ChaosCardKhorne.WAR_CRY;
        descriptions = ChaosCardKhorne.WAR_CRY_DESCRIPTIONS;
        abilityPowerCost = 1;
    }

    public static ChaosCard getCard() {
        return new WarCryKhornChaosCard();
    }


    @Override
    public void play() {

    }
}
