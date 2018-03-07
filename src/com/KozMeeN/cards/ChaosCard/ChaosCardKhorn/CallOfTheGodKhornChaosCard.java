package com.KozMeeN.cards.ChaosCard.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class CallOfTheGodKhornChaosCard extends ChaosCardKhorne {

    private CallOfTheGodKhornChaosCard(){
        name = ChaosCardKhorne.CALL_OF_THE_GOD;
        descriptions = ChaosCardKhorne.CALL_OF_THE_GOD_DESCRIPTIONS;
        abilityPowerCost = 2;
    }

    public static ChaosCard getCard() {
        return new CallOfTheGodKhornChaosCard();
    }

    @Override
    public void play() {

    }
}
