package com.KozMeeN.cards.ChaosCard.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class WarCryKhornChaosCard extends ChaosCardKhorn {

    private WarCryKhornChaosCard(){
        name = ChaosCardKhorn.WAR_CRY;
        descriptions = ChaosCardKhorn.WAR_CRY_DESCRIPTIONS;
        nowUse = true;
        manaCost = 1;
    }

    public static ChaosCard getCard() {
        return new WarCryKhornChaosCard();
    }


    @Override
    public void play() {

    }
}
