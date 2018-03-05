package com.KozMeeN.map.BoxesOnBoard;

import com.KozMeeN.cards.ChaosCard.ChaosCard;
import com.KozMeeN.figures.Figurine;

import java.util.ArrayList;
import java.util.List;

public abstract class Region {

    protected Region() {
        populous = false;
        destroyed = false;
        modifierConquestValue = 0;
        modifierResistanceValue = 0;
        boxOne=null;
        boxTwo=null;
    }

    public static String BAD_LANDS_NAME = "Złe ziemie";
    public static String BORDER_PRINCES_NAME = "Księstwa graniczne";
    public static String TILEA_NAME = "Tilea";
    public static String ESTALIA_NAME = "Estalia";
    public static String BRETONIA_NAME = "Bretonia";
    public static String EMPIRE_NAME = "Imperium";
    public static String KISLEV_NAME = "Kislev";
    public static String TROLL_LAND_NAME = "Kraina troli";
    public static String NORSKA_NAME = "Norska";

    /**
     * we create the map static, I means the map will be whenever the same, the location will be on 1st plays, if we create map 1st time
     * and 100th time, so I add static values to easier finding of the searched region.
     */
    public static int NORSKA_ID = 0;
    public static int TROLL_LAND_ID = 1;
    public static int KISLEV_ID = 2;
    public static int EMPIRE_ID = 3;
    public static int BRETONIA_ID = 4;
    public static int ESTALIA_ID = 5;
    public static int TILEA_ID = 6;
    public static int BORDER_PRINCES_ID = 7;
    public static int BAD_LANDS_ID = 8;


    ChaosCard boxOne;
    ChaosCard boxTwo;

    List<Figurine> figurineList = new ArrayList<>();

    boolean destroyed;
    boolean populous;

    protected String name;
    int conquestValue;
    int resistanceValue;
    int modifierConquestValue;
    int modifierResistanceValue;

    /**
     * method checks if the box is empty.
     * @return true if boxOne is occupied
     * false if is not.
     */

    public String getName(){
        return name;
    }
    public boolean isBoxOneOccupied(){
        if(boxOne == null) return false;
        return true;
    }

    /**
     * on every box we have two box on card, when player can play your card. 1st card should be play on boxOne 2nd on boxTwo.
     * when both of them will be occupied player can play the card in this region
     * @param card which card we will play on this box.
     */
    public void setBoxOne(ChaosCard card){
        boxOne = card;
    }
    public boolean isBoxTwoOccupied(){
        if(boxTwo == null) return false;
        return true;
    }
    public void setBoxTwo(ChaosCard card){
        boxTwo = card;
    }

    public ChaosCard clearBoxOneCard(){
        ChaosCard returnedChaosCard = boxOne;
        boxOne = null;
        return returnedChaosCard;
    }
    public ChaosCard clearTwoOneCard(){
        ChaosCard returnedChaosCard = boxTwo;
        boxTwo = null;
        return returnedChaosCard;
    }

    /**
    * We can check how many slots are occupied in this region.
     */
    public void checkSlots(){
        if(isBoxOneOccupied()){
            System.out.println(this.name);
            boxOne.write();
            if(isBoxTwoOccupied()) {
                boxTwo.write();
            }
        }
    }


    /**
     * we can show on console information about region.
     */
    public void write(){
        System.out.println("Name:" + name);
        System.out.println("Punkty: " + conquestValue);
        if(populous) System.out.println("Gesto zaludniony");
    }
    public void writeNames(){
        System.out.println("Name:" + name);
    }

    public void addToFigurineList(Figurine figurine) {
        figurineList.add(figurine);
    }
}
