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
        //canPlay = true;
    }

    public static String KHORN_NAME = "Khorn";
    public static int KHORN_ID = 0;
    /**Name of ChaosGods
     */
    protected String name;

    /**
     * if can play == true player can do action in his round.
     */
    //private boolean canPlay;

    /**
     * maxAbilityPoints maximum values of AbilityPoints
     * startAbilityPoints values of AbilityPoints at the beginning of the round, values can be increment in developmentCards
     * abilityPoints actual values of AbilityPoints
     */

    protected final int maxAbilityPoints = 12;
    protected int startAbilityPoints;
    protected int abilityPoints;

    /**
     * deck of our champion
     */

    protected List<ChaosCard> deck = new ArrayList<ChaosCard>();
    private  List<ChaosCard> onHandDeck = new ArrayList<ChaosCard>();
    public List<ChaosCard> throwDeck = new ArrayList<ChaosCard>();

    protected int winPoints;

    protected int[] valuesOfDangerPoints;
    protected int indexOfDangerPoints;
    protected int dangerPoints;



    /**
     * @return deck chosen champion
     */
    public abstract List<ChaosCard> getDeck();

    public List<ChaosCard> getOnHandDeck(){
        return this.onHandDeck;
    }

    public ChaosCard getOnHandDeckCardById(int cardId){
        if(cardId<=onHandDeck.size()&&cardId>=0&&onHandDeck.size()!=0) {
            return onHandDeck.get(cardId);
        }else if(cardId>onHandDeck.size()){
            System.err.println("Wrong number of index, do not have enough card to use this Id. Return default value null");
            return null;
        }else if(cardId<0){
            System.err.println("Wrong number of index, value can not be negative. Return default value null");
            return null;
        }else if(onHandDeck.size()==0){
            System.err.println("Wrong number of index, have not any cards onHand. Return default value null");
            return null;
        }else{
            System.err.println("getOnHandDeck do another options.");
            return null;
        }
    }

    /**
     * method remove selected card form onHandDeck
     * @param cardId id of card which we want to remove.
     */
    public void removeCardFromHandDeck(int cardId) {
        if(cardId<=onHandDeck.size()&&cardId>=0&&onHandDeck.size()!=0) {
            onHandDeck.remove(cardId);
        }else {
            System.err.println("Wrong number of index. Can not remove a card. ");
        }
    }

    /**
     * method allows us to choose cards as many as we want.
     * @param howMuch howMuch card we want to choose.
     */
    public void choseCard(int howMuch) {
        if(deck.size()<howMuch){
            System.err.println("Can not chose this number of cards. We chose maximum value of it.");
        } else if(howMuch == 0){
            System.err.println("Can not chose 0 cards.");
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
    public boolean canPlay(){
        if(abilityPoints>0){
            return true;
        }return false;
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
        if(indexOfDangerPoints<valuesOfDangerPoints.length-1) {
            indexOfDangerPoints++;
            dangerPoints = valuesOfDangerPoints[indexOfDangerPoints];
        }else{
            System.err.println("dangerPoints achieve maximal value. Can not increase more.");
        }
    }



    /**
     * method will increase winPoints.
     */
    public void increaseWinPoints(int howMany){
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
    public ChaosCard playCard(ChaosCard card, Region box){
        if(onHandDeck.size()==0){
            System.err.println("Have 0 cards. Can not play card. Returned null.");
            return null;
        }else if(abilityPoints==0) {
            System.err.println("Have 0 mana, can not play any cards. Returned null.");
            return null;
        }else{
            if (card.getManaCost() <= abilityPoints) {
                ChaosCard returnedCard;
                if (!box.isBoxOneOccupied()) {
                    box.setBoxOne(card);
                } else if (!box.isBoxTwoOccupied()) {
                    box.setBoxTwo(card);
                } else {
                    System.err.println("Both box are occupied. Returned null.");
                    return null;
                }
                abilityPoints -= card.getManaCost();
                returnedCard = card;
                onHandDeck.remove(card);
                return returnedCard;
            } else {
                System.err.println("Have not enough mana. Returned Null");
                return null;
            }
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
