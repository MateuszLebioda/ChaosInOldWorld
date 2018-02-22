package com.KozMeeN.cards.ChaosCard.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class RitualMorderKhornChaosCard extends ChaosCardKhorn {

    private RitualMorderKhornChaosCard(){
        name = ChaosCardKhorn.RITUAL_MURDER;
        descriptions = ChaosCardKhorn.RITUAL_MURDER_DESCRIPTIONS;
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
