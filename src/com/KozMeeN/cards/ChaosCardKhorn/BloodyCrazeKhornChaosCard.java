package com.KozMeeN.cards.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard;

/**
 * Object representing "Krwawy szła" card.
 */
public class BloodyCrazeKhornChaosCard extends ChaosCardKhorn{

    private BloodyCrazeKhornChaosCard(){
        name = ChaosCardKhorn.BLOODY_CRAZE;
        descriptions = ChaosCardKhorn.BLOODY_CRAZE_DESCRIPTIONS;
        fightUse = true;
        manaCost = 0;
    }

    public static ChaosCard getCard() {
        return new BloodyCrazeKhornChaosCard();
    }

    @Override
    public void play() {

    }
}
