package com.KozMeeN.champions;

import com.KozMeeN.cards.ChaosCard.ChaosCard;
import com.KozMeeN.map.MapOfGame;
import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.*;

public class khornChampionTest {

    Champion khorn;
    MapOfGame map;

    @Before
    public void startUp(){
        khorn = new KhornChampion();
        map = new MapOfGame();
    }

    /**
     * Tests for constructor
     */
    @Test
    public void checkNameCreateChampionTest(){
        assertEquals("Khorn",khorn.name);
    }

    /**
     * Tests for GetOnHandDeckCardByIdTest
     */
    @Test
    public void correctNumberOfIdOfGetOnHandDeckCardByIdTest(){
        khorn.choseCard(2);
        assertEquals(khorn.getOnHandDeckCardById(0),khorn.getOnHandDeckCardById(0));
    }

    @Test
    public void toManyNumberOfIdOfGetOnHandDeckCardByIdTest(){
        khorn.choseCard(2);
        assertEquals(null,khorn.getOnHandDeckCardById(3));
    }

    @Test
    public void negativeNumberOfIdOfGetOnHandDeckCardByIdTest(){
        khorn.choseCard(2);
        assertEquals(null,khorn.getOnHandDeckCardById(-1));
    }

    @Test
    public void emptyDeckGetOnHandDeckCardByIdTest(){
        assertEquals(null,khorn.getOnHandDeckCardById(0));
    }

    @Test
    public void emptyDeckToManyNumberGetOnHandDeckCardByIdTest(){
        assertEquals(null,khorn.getOnHandDeckCardById(30));
    }

    /**
     * Tests for removeCardFromDeck
     */
    @Test
    public void correctNumberOfIdOfRemoveCardFromHandDeckTest() {
        khorn.choseCard(2);
        assertEquals(2,khorn.getOnHandDeck().size());
        khorn.removeCardFromHandDeck(0);
        assertEquals(1,khorn.getOnHandDeck().size());
    }

    @Test
    public void toManyNumberOfIdOfRemoveCardFromHandDeckTest() {
        khorn.choseCard(2);
        assertEquals(2,khorn.getOnHandDeck().size());
        khorn.removeCardFromHandDeck(3);
        assertEquals(2,khorn.getOnHandDeck().size());
    }

    @Test
    public void negativeNumberOfIdOfRemoveCardFromHandDeckTest() {
        khorn.choseCard(2);
        assertEquals(2,khorn.getOnHandDeck().size());
        khorn.removeCardFromHandDeck(-2);
        assertEquals(2,khorn.getOnHandDeck().size());
    }

    @Test
    public void zeroNumberOfIdOfRemoveCardFromHandDeckTest() {
        khorn.choseCard(0);
        assertEquals(0,khorn.getOnHandDeck().size());
        khorn.removeCardFromHandDeck(0);
        assertEquals(0,khorn.getOnHandDeck().size());
    }

    @Test
    public void removeCardFromEmptyDeckRemoveCardFromHandDeckTest(){
        khorn.removeCardFromHandDeck(0);
    }

    /**
     * Tests for choseCard method
     */
    @Test
    public void zeroChoseCardTest(){
        khorn.choseCard(0);
        assertEquals(0,khorn.getOnHandDeck().size());
    }

    @Test
    public void correctNumberOfChoseCardTest(){
        khorn.choseCard(2);
        assertEquals(2,khorn.getOnHandDeck().size());
    }

    @Test
    public void ToManyChosenCardTest(){
        khorn.choseCard(30);
        assertEquals(24,khorn.getOnHandDeck().size());
    }

    @Test
    public void negativeValueOfChoseCardTest(){
        khorn.choseCard(-3);
        assertEquals(0,khorn.getOnHandDeck().size());
    }

    /**
     * Tests for canPlay method
      */
    @Test
    public void positiveValueOfManaPointsCanPlayTest(){
        khorn.abilityPoints = 1;
        assertEquals(true,khorn.canPlay());
    }

    @Test
    public void negativeValueOfManaPointsCanPlayTest(){
        khorn.abilityPoints = -1;
        assertEquals(false,khorn.canPlay());
    }

    @Test
    public void zeroValueOfManaPointsCanPlayTest(){
        khorn.abilityPoints = 0;
        assertEquals(false,khorn.canPlay());
    }

    /**
     * tests for increaseDangerPoints
     */
    @Test
    public void correctIncreaseDangerPointsTest(){
        khorn.indexOfDangerPoints = 0;
        assertEquals(3,khorn.dangerPoints);
        khorn.increaseDangerPoints();
        assertEquals(6,khorn.dangerPoints);
        khorn.increaseDangerPoints();
        assertEquals(12,khorn.dangerPoints);
        khorn.increaseDangerPoints();
        assertEquals(14,khorn.dangerPoints);
        khorn.increaseDangerPoints();
        assertEquals(17,khorn.dangerPoints);
        khorn.increaseDangerPoints();
        assertEquals(23,khorn.dangerPoints);
        khorn.increaseDangerPoints();
        assertEquals(28,khorn.dangerPoints);
        khorn.increaseDangerPoints();
        assertEquals(31,khorn.dangerPoints);
        khorn.increaseDangerPoints();
        assertEquals(32,khorn.dangerPoints);
        khorn.increaseDangerPoints();
        assertEquals(100,khorn.dangerPoints);
    }

    @Test
    public void outOfRangeIncreaseDangerPointsTest(){
        khorn.indexOfDangerPoints = 8;
        khorn.increaseDangerPoints();
        khorn.increaseDangerPoints();
        assertEquals(100,khorn.dangerPoints);
    }

    /**
     * test for playCard
     */

    @Test
    public void manaPlayCardTest(){
        khorn.abilityPoints = 0;
        khorn.choseCard(1);
        assertEquals(false,khorn.playCard(khorn.getOnHandDeckCardById(0),map.getRegionById(0)));
        khorn.abilityPoints = 10;
        assertEquals(true,khorn.playCard(khorn.getOnHandDeckCardById(0),map.getRegionById(0)));
    }

    @Test
    public void occupiedRegionsPlayCardTest(){
        khorn.abilityPoints = 10;
        khorn.choseCard(3);
        assertEquals(true,khorn.playCard(khorn.getOnHandDeckCardById(0),map.getRegionById(0)));
        assertEquals(true,khorn.playCard(khorn.getOnHandDeckCardById(0),map.getRegionById(0)));
        assertEquals(false,khorn.playCard(khorn.getOnHandDeckCardById(0),map.getRegionById(0)));
    }

    @Test
    public void enoughCardsOnHand(){
        khorn.abilityPoints = 10;
        khorn.choseCard(1);
        assertEquals(true,khorn.playCard(khorn.getOnHandDeckCardById(0),map.getRegionById(0)));
        assertEquals(false,khorn.playCard(khorn.getOnHandDeckCardById(0),map.getRegionById(0)));
    }

    /**
     * Tests for creteDeck method
     */
    @Test
    public void createDeckTest(){
        int cards[] = new int[7];
        for(int x:cards) x = 0;

        for(ChaosCard card:khorn.deck){
            switch (card.getName()){
                case "Krwawy szał":{
                    cards[0]++;
                    break;
                }case "Obszar rzezi":{
                    cards[1]++;
                    break;
                }case "Okrzyk wojenny":{
                    cards[2]++;
                    break;
                }case "Rytualny mord":{
                    cards[3]++;
                    break;
                }case "Tron czaszek":{
                    cards[4]++;
                    break;
                }case "Odrodzenie we krwi":{
                    cards[5]++;
                    break;
                }case "Zew Boga Krwi":{
                    cards[6]++;
                    break;
                }
            }
        }
        assertEquals(4,cards[0]);
        assertEquals(4,cards[2]);
        assertEquals(4,cards[4]);
        assertEquals(3,cards[3]);
        assertEquals(3,cards[1]);
        assertEquals(3,cards[5]);
        assertEquals(3,cards[6]);
    }

}