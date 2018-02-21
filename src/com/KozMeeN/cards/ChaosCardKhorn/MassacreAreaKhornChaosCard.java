package com.KozMeeN.cards.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard;

public class MassacreAreaKhornChaosCard extends ChaosCardKhorn {

    private MassacreAreaKhornChaosCard(){
        name = ChaosCardKhorn.MASSACRE_AREA;
        descriptions = ChaosCardKhorn.MASACRE_AREA_DESCRIPTIONS;
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
