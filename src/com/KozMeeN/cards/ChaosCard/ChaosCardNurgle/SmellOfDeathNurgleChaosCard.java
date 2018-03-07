package com.KozMeeN.cards.ChaosCard.ChaosCardNurgle;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class SmellOfDeathNurgleChaosCard extends ChaosCardNurgle {
    SmellOfDeathNurgleChaosCard(){
        name = ChaosCardNurgle.SMELL_OF_DEATH;
        descriptions = ChaosCardNurgle.SMELL_OF_DEATH_DESCRIPTIONS;
        abilityPowerCost = 3;
        magicSymbol = true;
    }

    public static ChaosCard getCard() {
        return new SmellOfDeathNurgleChaosCard();
    }

    @Override
    public void play() {

    }
}
