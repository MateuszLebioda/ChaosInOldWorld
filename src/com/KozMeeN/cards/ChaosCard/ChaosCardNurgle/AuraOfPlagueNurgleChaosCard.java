package com.KozMeeN.cards.ChaosCard.ChaosCardNurgle;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class AuraOfPlagueNurgleChaosCard extends ChaosCardNurgle {
    AuraOfPlagueNurgleChaosCard(){
            name = ChaosCardNurgle.AURA_OF_PLAGUE;
            descriptions = ChaosCardNurgle.AURA_OF_PLAGUE_DESCRIPTIONS;
            abilityPowerCost = 0;
            magicSymbol = true;
    }

    public static ChaosCard getCard() {
        return new AuraOfPlagueNurgleChaosCard();
    }

    @Override
    public void play() {

    }
}
