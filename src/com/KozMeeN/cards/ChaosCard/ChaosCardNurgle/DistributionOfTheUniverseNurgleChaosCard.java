package com.KozMeeN.cards.ChaosCard.ChaosCardNurgle;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class DistributionOfTheUniverseNurgleChaosCard extends ChaosCardNurgle {
    DistributionOfTheUniverseNurgleChaosCard(){
        name = ChaosCardNurgle.DISTRIBUTION_OF_THE_UNIVERSE;
        descriptions = ChaosCardNurgle.DISTRIBUTION_OF_THE_UNIVERSE_DESCRIPTIONS;
        abilityPowerCost = 1;
        magicSymbol = false;
    }

    public static ChaosCard getCard() {
        return new DistributionOfTheUniverseNurgleChaosCard();
    }

    @Override
    public void play() {

    }
}
