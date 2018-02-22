package com.KozMeeN.cards.ChaosCard.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class MassacreAreaKhornChaosCard extends ChaosCardKhorn {

    private MassacreAreaKhornChaosCard(){
        name = ChaosCardKhorn.MASSACRE_AREA;
        descriptions = ChaosCardKhorn.MASSACRE_AREA_DESCRIPTIONS;
        nowUse = true;
        manaCost = 1;
    }

    public static ChaosCard getCard() {
        return new MassacreAreaKhornChaosCard();
    }

    @Override
    public void play() {

    }
}
