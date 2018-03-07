package com.KozMeeN.champions;

import com.KozMeeN.cards.ChaosCard.ChaosCard;
import com.KozMeeN.figures.Figurine;
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

    public static String KHORNE_NAME = "Khorn";
    public static int KHORNE_ID = 0;
    public static String NURGLE_NAME = "Nurgle";
    public static int NURGLE_ID = 1;
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

    protected List<Figurine> onHandFigurine = new ArrayList<>();

    protected int winPoints;

    protected int[] valuesOfDangerPoints;
    protected int indexOfDangerPoints;
    protected int dangerPoints;


    /**
     * @return deck chosen champion
     */
    protected abstract List<ChaosCard> createDeck();

    protected abstract List<Figurine> createFigurine();

    public String  getName(){
        return name;
    }


    public List<ChaosCard> getOnHandDeck(){
        return this.onHandDeck;
    }

    public ChaosCard getOnHandDeckCardById(int cardId){
        if(cardId<=onHandDeck.size()&&cardId>=0&&onHandDeck.size()!=0) {
            return onHandDeck.get(cardId);
        }else if(onHandDeck.size()==0){
                System.err.println("Wrong number of index, have not any cards onHand. Return default value null");
                return null;
        }else if(cardId>onHandDeck.size()){
            System.err.println("Wrong number of index, do not have enough card to use this Id. Return default value null");
            return null;
        }else if(cardId<0){
            System.err.println("Wrong number of index, value can not be negative. Return default value null");
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
        }else if(onHandDeck.size()==0){
            System.err.println("Wrong number of index, HandDeck is empty. Can not remove a card. ");
        }else if(cardId>onHandDeck.size()){
            System.err.println("Wrong number of index, to high number of Id. Can not remove a card. ");
        }else if(cardId<0){
            System.err.println("Wrong number of index, id can not be negative. Can not remove a card. ");
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

    public void addCardToThrowDeck(ChaosCard card){
        throwDeck.add(card);
    }



    /**
     *
     * @param card which card will be play.
     * @param region where the card will be play.
     * @return results, the card was play, or not.
     * card can be play, when in the box we have at least one free slot on card, and we have enough abilityPoints to play the card.
     * when we play a card method will return true, so we will be able to delete this card in your onHandsCard, and put  into regionBox.
     * when we did not play a card, method will return false.
     */
    public boolean playCard(ChaosCard card,Region region){
        if(onHandDeck.size()==0){
            System.err.println("Have 0 cards. Can not play card. Returned null.");
            return false;
        }else if(abilityPoints==0) {
            System.err.println("Have 0 abilityPoints, can not play any cards. Returned null.");
            return false;
        }else{
            if (card.getAbilityPowerCost() <= abilityPoints) {
                if (!region.isBoxOneOccupied()) {
                    region.setBoxOne(card);
                    System.out.println("Zagrano karte na pole pierwsze.");
                } else if (!region.isBoxTwoOccupied()) {
                    region.setBoxTwo(card);
                    System.out.println("Zagrano kartę na pole drugie.");
                } else {
                    System.err.println("Both box are occupied. Returned null.");
                    return false;
                }
                abilityPoints -= card.getAbilityPowerCost();
                onHandDeck.remove(card);
                return true;
            } else {
                System.err.println("Have not enough abilityPoints. Returned Null");
                return false;
            }
        }
    }

    /**
     *
     * @param figurine which figurine will be play.
     * @param region where the figurine will be play.
     * @return results, the figurine was play, or not.
     * figurine can be play, when  we have enough abilityPoints to play the card.
     * when we play a figurine method will return true, so we will be able to delete this figurine in your onHandsFigurine, and put into region.
     * when we did not play a figurine, method will return false.
     */
    public boolean playFigurine(Figurine figurine,Region region){
        if(onHandFigurine.size()==0){
            System.err.println("Have 0 figurine. Can not play figurine. Returned null.");
            return false;
        }else if(abilityPoints==0) {
            System.err.println("Have 0 abilityPoints, can not play any figurine. Returned null.");
            return false;
        }else{
            if (figurine.getAbilityPowerCost() <= abilityPoints) {
                region.addToFigurineList(figurine);
                abilityPoints -= figurine.getAbilityPowerCost();
                onHandDeck.remove(figurine);
                return true;
            } else {
                System.err.println("Have not enough abilityPoints. Returned Null");
                return false;
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
    public void reviewCards(List<ChaosCard> list){
        System.out.println("********************");
        for(ChaosCard cards: list){
            cards.write();
        }
        System.out.println("********************");
    }

    /**
     * when our mana will be equals 0. our turn will be end.
     */
    private void pass(){
        abilityPoints = 0;
    }

    /**
     * simple method thanks that we can add the card to our deck.
     * @param howMany how many similar cards we want to add.
     * @param card specific type of cards which we want to add.
     * @param deck in which deck you want to add cards.
     */
    protected void addCard(int howMany,ChaosCard card,List<ChaosCard> deck){
        for(int i=0;i<howMany;i++) deck.add(card);
    }

    /**
     * simple method thanks that we can add the figures to our deck.
     * @param howMany how many figures we want to add.
     * @param figures specific type of cards which we want to add.
     * @param deck in which deck you want to add cards.
     */
    protected void addFigures(int howMany,Figurine figures,List<Figurine> deck){
        for(int i=0;i<howMany;i++) deck.add(figures);
    }

    /**
     * method will bring benefits from DangerPoints.
     * if we will be have the most DangerPoints of all players], we will turn Wheel 2 times, and get double benefits.
     */
    private void turnWheel(){}
}
