package com.KozMeeN.champions;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * @author KozMeeN
 * Frame how to one of ChaosGods will lokk like.
 */
public abstract class Champion {

    /**Name of ChaosGods
     */
    protected String name;

    /**
     * maxAbilityPoints maximum values of AbilityPoints
     * startAbilityPoints values of AbilityPoints at the beginning of the round, values can be increment in developmentCards
     * abilityPointions actual values of AbilityPoints
     */

    final int maxAbilityPoints = 12;
    protected int startAbilityPoints;
    private int abilityPointions;

    /**
     * deck of our champion
     */

    public List<ChaosCard> deck = new ArrayList<ChaosCard>();
    public List<ChaosCard> onHandDeck = new ArrayList<ChaosCard>();
    public List<ChaosCard> throwDeck = new ArrayList<ChaosCard>();

    protected int winPoints;

    protected int[] valuesOfDangerPoints;
    protected int indexOfDangerPoints;
    protected int dangerPoints;


    /**
     * method allows us to choose cards as many as we want.
     * @param howMuch howMuch card we want to choose.
     */
    public void choseCard(int howMuch) {

        for (int i = 0; i < howMuch; i++) {
            if (deck.size() > 0) {
                Random roll = new Random();
                int random = roll.nextInt(deck.size());
                onHandDeck.add(deck.get(random));
                deck.remove(random);
            }
        }
    }


    abstract void dangerPointsProfit(int indexOfDangerPoints);
    abstract void increaseDangerPoints();
    protected void increaseWinPoints(){}
    private void playCard(){}
    private void playMonster(){}
    private void pass(){}
    private void turnWheel(){}
}
