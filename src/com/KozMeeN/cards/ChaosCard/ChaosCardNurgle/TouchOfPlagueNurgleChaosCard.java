package com.KozMeeN.cards.ChaosCard.ChaosCardNurgle;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class TouchOfPlagueNurgleChaosCard extends ChaosCardNurgle {
    TouchOfPlagueNurgleChaosCard(){
        name = ChaosCardNurgle.TOUCH_OF_PLAGUE;
        descriptions = ChaosCardNurgle.TOUCH_OF_PLAGUE_DESCRIPTIONS;
        abilityPowerCost = 0;
        magicSymbol = false;
    }

    public static ChaosCard getCard() {
        return new TouchOfPlagueNurgleChaosCard();
    }

    @Override
    public void play() {

    }
}
