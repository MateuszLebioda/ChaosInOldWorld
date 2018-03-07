package com.KozMeeN.cards.ChaosCard.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class MassacreAreaKhornChaosCard extends ChaosCardKhorne {

    private MassacreAreaKhornChaosCard(){
        name = ChaosCardKhorne.MASSACRE_AREA;
        descriptions = ChaosCardKhorne.MASSACRE_AREA_DESCRIPTIONS;
        abilityPowerCost = 1;
    }

    public static ChaosCard getCard() {
        return new MassacreAreaKhornChaosCard();
    }

    @Override
    public void play() {

    }
}
