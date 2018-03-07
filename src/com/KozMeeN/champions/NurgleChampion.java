package com.KozMeeN.champions;

import com.KozMeeN.cards.ChaosCard.ChaosCard;
import com.KozMeeN.cards.ChaosCard.ChaosCardNurgle.*;
import com.KozMeeN.figurine.Figurine;
import com.KozMeeN.figurine.NurgleFigurine.BosNurgleFigure;
import com.KozMeeN.figurine.NurgleFigurine.CultistNurgleFigurine;
import com.KozMeeN.figurine.NurgleFigurine.WarriorNurgleFigure;

import java.util.ArrayList;
import java.util.List;

public class NurgleChampion extends Champion{
    public NurgleChampion(){
        name = Champion.NURGLE_NAME;
        startAbilityPoints = 6;
        abilityPoints = startAbilityPoints;
        valuesOfDangerPoints = new int[]{1, 5, 10, 13, 18, 22, 26, 30, 33, 34,  100};
        indexOfDangerPoints = 0;
        deck = createDeck();
        onHandFigurine = createFigurine();
        dangerPoints = valuesOfDangerPoints[indexOfDangerPoints];
        winPoints = 0;
    }

    @Override
    protected List<ChaosCard> createDeck() {
        List<ChaosCard> deck = new ArrayList<>();

        addCard(4, FluNurgleChaosCard.getCard(),deck);
        addCard(4, AuraOfPlagueNurgleChaosCard.getCard(),deck);

        addCard(3, TuberculosisEpidemicNurgleChaosCard.getCard(),deck);
        addCard(3, FinalDistributionNurgleChaosCard.getCard(),deck);
        addCard(3, OilRainNurgleChaosCard.getCard(),deck);
        addCard(3, TouchOfPlagueNurgleChaosCard.getCard(),deck);

        addCard(2, DistributionOfTheUniverseNurgleChaosCard.getCard(),deck);
        addCard(2, SmellOfDeathNurgleChaosCard.getCard(),deck);
        return deck;
    }

    @Override
    protected List<Figurine> createFigurine() {
        List<Figurine> figurine = new ArrayList<>();

        addFigures(5, WarriorNurgleFigure.getInstance(),figurine);
        addFigures(6, CultistNurgleFigurine.getInstance(),figurine);
        addFigures(1, BosNurgleFigure.getInstance(),figurine);
        return figurine;
    }

    @Override
    void dangerPointsProfit(int indexOfDangerPoints) {

    }
}
