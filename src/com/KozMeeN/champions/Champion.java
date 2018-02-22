package com.KozMeeN.champions;

import com.KozMeeN.cards.ChaosCard.ChaosCard;
import com.KozMeeN.map.BoxesOnBoard.Region;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * @author KozMeeN
 * Frame how to one of ChaosGods will lokk like.
 */
public abstract class Champion {

    Champion(){
        canPlay = true;
    }

    public static String KHORN_NAME = "Khorn";
    public static int KHORN_ID = 0;
    /**Name of ChaosGods
     */
    protected String name;

    /**
     * if can play == true player can do action in his round.
     */
    boolean canPlay;

    /**
     * maxAbilityPoints maximum values of AbilityPoints
     * startAbilityPoints values of AbilityPoints at the beginning of the round, values can be increment in developmentCards
     * abilityPoints actual values of AbilityPoints
     */

    final int maxAbilityPoints = 12;
    protected int startAbilityPoints;
    protected int abilityPoints;

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
        if(deck.size()<howMuch){
            System.out.println("Nie można dobrać tylu kart!\nZostanie dobrane: " + deck.size() + " kart.");
        }
        for (int i = 0; i < howMuch; i++) {

            if (deck.size() > 0) {
                Random roll = new Random();
                int random = roll.nextInt(deck.size());
                onHandDeck.add(deck.get(random));
                deck.remove(random);
            }
        }
    }

    /**
     * Checks if u can do next move.
     * Your turn is end when yours manaPoints ale equals 0.
     */
    public void canPlay(){
        if(abilityPoints ==0){
            canPlay = false;
        }
    }

    /**
     *  This method define what will happen when you increment yours DangerPoints, method is abstract because every champion
     *  has different profits.
     * @param indexOfDangerPoints is a value of how many times u turn yours championsWheel.
     * profits which you can get are dependent on your indexODangerPoints.
     */
    abstract void dangerPointsProfit(int indexOfDangerPoints);

    /**
     * method will increase dangerPoints
     */
    public void increaseDangerPoints(){
        if(indexOfDangerPoints<=valuesOfDangerPoints.length) {
            indexOfDangerPoints++;
            dangerPoints = valuesOfDangerPoints[indexOfDangerPoints];
        }
    }

    /**
     * method will increase winPoints.
     */
    protected void increaseWinPoints(int howMany){
        winPoints += howMany;
    }

    /**
     * using this method you can show in console all cards of deck.
     */
    public void reviewCardsOnHand(){
        System.out.println("********************");
        for(ChaosCard cards: onHandDeck){
            cards.write();
        }
        System.out.println("********************");
    }

    /**
     *
     * @param card which card will be play.
     * @param box where the card will be play.
     * @return results, the card was play, or not.
     * card can be play, when in the box we have at least one free slot on card, and we have enough mana to play the card.
     * when we play a card method will return true, so we will be able to delete this card in your onHandsCard, and put in into throwCard.
     * when we did not play a card, method will return false.
     */
    public boolean setCard(ChaosCard card, Region box){
        if(card.getManaCost()<= abilityPoints) {
            if (!box.isBoxOneOccupied()) {
                box.setBoxOne(card);
                abilityPoints -= card.getManaCost();
                return true;
            } else if (!box.isBoxTwoOccupied()) {
                box.setBoxTwo(card);
                abilityPoints -= card.getManaCost();
                return true;
            } else {
                System.out.println("Nie można zagrać karty oba pola sa zajete!");
                return false;
            }
        }else {
            System.out.println("Za mało many");
            return false;
        }
    }

    private void playMonster(){}

    /**
     * when our mana will be equals 0. our turn will be end.
     */
    private void pass(){
        abilityPoints = 0;
    }

    /**
     * simple method thanks that we can add the card to our deck.
     * @param howMany how many cards similar cards we want to add.
     * @param card specific type of cards which we want to add.
     * @param deck in which deck you want to add cards.
     */
    protected void addCard(int howMany,ChaosCard card,List<ChaosCard> deck){
        for(int i=0;i<howMany;i++) deck.add(card);
    }

    /**
     * method will bring benefits from DangerPoints.
     * if we will be have the most DangerPoints of all players], we will turn Wheel 2 times, and get double benefits.
     */
    private void turnWheel(){}
}
