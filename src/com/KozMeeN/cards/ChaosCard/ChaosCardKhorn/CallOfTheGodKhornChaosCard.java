package com.KozMeeN.cards.ChaosCard.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class CallOfTheGodKhornChaosCard extends ChaosCardKhorn {

    private CallOfTheGodKhornChaosCard(){
        name = ChaosCardKhorn.CALL_OF_THE_GOD;
        descriptions = ChaosCardKhorn.CALL_OF_THE_GOD_DESCRIPTIONS;
        nowUse = true;
        manaCost = 2;
    }

    public static ChaosCard getCard() {
        return new CallOfTheGodKhornChaosCard();
    }

    @Override
    public void play() {

    }
}
