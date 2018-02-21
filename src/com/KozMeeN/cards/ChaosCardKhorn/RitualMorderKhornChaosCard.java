package com.KozMeeN.cards.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard;

public class RitualMorderKhornChaosCard extends ChaosCardKhorn {

    private RitualMorderKhornChaosCard(){
        name = ChaosCardKhorn.RITUAL_MORDER;
        descriptions = ChaosCardKhorn.RITUAL_MORDER_DESCRIPTIONS;
        nowUse = true;
        manaCost = 1;
    }

    public static ChaosCard getCard() {
        return new RitualMorderKhornChaosCard();
    }


    @Override
    public void play() {

    }
}
