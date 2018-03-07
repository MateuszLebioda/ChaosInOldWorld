package com.KozMeeN.cards.ChaosCard.ChaosCardNurgle;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class FinalDistributionNurgleChaosCard extends ChaosCardNurgle {
    FinalDistributionNurgleChaosCard(){
        name = ChaosCardNurgle.FINAL_DISTRIBUTION;
        descriptions = ChaosCardNurgle.FINAL_DISTRIBUTION_DESCRIPTIONS;
        abilityPowerCost = 2;
        magicSymbol = false;
    }

    public static ChaosCard getCard() {
        return new FinalDistributionNurgleChaosCard();
    }

    @Override
    public void play() {

    }
}
