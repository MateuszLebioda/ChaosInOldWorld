package com.KozMeeN.cards.ChaosCard.ChaosCardNurgle;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class TuberculosisEpidemicNurgleChaosCard extends ChaosCardNurgle {
    TuberculosisEpidemicNurgleChaosCard(){
        name = ChaosCardNurgle.TUBERCULOSIS_EPIDEMIC;
        descriptions = ChaosCardNurgle.TUBERCULOSIS_EPIDEMIC_DESCRIPTIONS;
        abilityPowerCost = 2;
        magicSymbol = false;
    }

    public static ChaosCard getCard() {
        return new TuberculosisEpidemicNurgleChaosCard();
    }

    @Override
    public void play() {

    }
}
