package com.KozMeeN.cards.ChaosCard.ChaosCardNurgle;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public class OilRainNurgleChaosCard extends ChaosCardNurgle{
    OilRainNurgleChaosCard(){
        name = ChaosCardNurgle.OIL_RAIN;
        descriptions = ChaosCardNurgle.OIL_RAIN_DESCRIPTIONS;
        abilityPowerCost = 1;
        magicSymbol = false;
    }

    public static ChaosCard getCard() {
        return new OilRainNurgleChaosCard();
    }

    @Override
    public void play() {

    }
}
