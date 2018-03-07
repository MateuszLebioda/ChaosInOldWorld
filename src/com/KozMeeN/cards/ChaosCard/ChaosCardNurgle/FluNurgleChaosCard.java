package com.KozMeeN.cards.ChaosCard.ChaosCardNurgle;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class FluNurgleChaosCard extends ChaosCardNurgle {
    FluNurgleChaosCard(){
        name = ChaosCardNurgle.FLU;
        descriptions = ChaosCardNurgle.FLU_DESCRIPTIONS;
        abilityPowerCost = 1;
        magicSymbol = false;
    }

    public static ChaosCard getCard() {
        return new FluNurgleChaosCard();
    }

    @Override
    public void play() {

    }
}
