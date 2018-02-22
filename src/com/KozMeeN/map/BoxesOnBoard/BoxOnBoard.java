package com.KozMeeN.map.BoxesOnBoard;

import com.KozMeeN.cards.ChaosCard.ChaosCard;

public abstract class BoxOnBoard {

    protected BoxOnBoard() {
        populous = false;
        destroyed = false;
        modifierConquestValue = 0;
        modifierResistanceValue = 0;
    }

    static String BAD_LANDS = "Złe ziemie";
    static String BORDER_PRINCES = "Księstwa graniczne";
    static String TILEA = "Tilea";
    static String ESTALIA = "Estalia";
    static String BRETONIA = "Bretonia";
    static String EMPIRE = "Imperium";
    static String KISLEV = "Kislev";
    static String TROLL_LAND = "Kraina troli";
    static String NORSKA = "Norska";

    ChaosCard boxOne;
    ChaosCard boxTwo;

    boolean destroyed;
    boolean populous;

    String name;
    int conquestValue;
    int resistanceValue;
    int modifierConquestValue;
    int modifierResistanceValue;


    public static BoxOnBoard getCard() {
        return null;
    }

    public void write(){
        System.out.println("Name:" + name);
        System.out.println("Punkty: " + conquestValue);
        if(populous) System.out.println("Gesto zaludniony");
    }

}
