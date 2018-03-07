package com.KozMeeN.cards.ChaosCard.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

/**
 * Object representing "Krwawy szła" card.
 */
public class BloodyCrazeKhornChaosCard extends ChaosCardKhorne {

    private BloodyCrazeKhornChaosCard(){
        name = ChaosCardKhorne.BLOODY_CRAZE;
        descriptions = ChaosCardKhorne.BLOODY_CRAZE_DESCRIPTIONS;
        abilityPowerCost = 0;
    }

    public static ChaosCard getCard() {
        return new BloodyCrazeKhornChaosCard();
    }

    @Override
    public void play() {

    }
}
