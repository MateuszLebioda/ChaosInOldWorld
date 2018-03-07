package com.KozMeeN.cards.ChaosCard.ChaosCardNurgle;


import com.KozMeeN.cards.ChaosCard.ChaosCard;
import com.KozMeeN.champions.Champion;

public abstract class ChaosCardNurgle extends ChaosCard{

    ChaosCardNurgle(){
        champion = Champion.NURGLE_NAME;
    }

    static String AURA_OF_PLAGUE = "Aura zarazy";
    static String TOUCH_OF_PLAGUE = "Dotyk zarazy";
    static String FLU = "Grypa";
    static String DISTRIBUTION_OF_THE_UNIVERSE = "Rozkład wszechrzeczy.";
    static String OIL_RAIN = "Deszcz ropy";
    static String FINAL_DISTRIBUTION = "Ostateczny rozkład";
    static String TUBERCULOSIS_EPIDEMIC = "Wielka epidemia gruźlicy";
    static String SMELL_OF_DEATH = "Wielka epidemia gruźlicy";

    static String AURA_OF_PLAGUE_DESCRIPTIONS = "Twój każdy żeton Zepsucia znajdujący się w tym regionie, dodaje jeden do wartości twojej dominacji w tym regionie.";
    static String TOUCH_OF_PLAGUE_DESCRIPTIONS = "Wartość obrony wszystkich wrogich figurek w tym regionie jest obniżona o jeden.";
    static String FLU_DESCRIPTIONS = "Opór tego regionu jest obniżony o dwa.";
    static String DISTRIBUTION_OF_THE_UNIVERSE_DESCRIPTIONS = "Po zaganiu tej karty, usuń z tego pola regionu żetoz zepsucia dowolnego gracza.";
    static String OIL_RAIN_DESCRIPTIONS = "Wartość obrony twoich figurek w tym regionie jest podwyższona o jeden.";
    static String FINAL_DISTRIBUTION_DESCRIPTIONS = "Na końcu Fazy Walki zabij jednego wrogiego kultystę lub wojownika w tym regionie za każdy twój żeton Zepsucia w tym regionie.";
    static String TUBERCULOSIS_EPIDEMIC_DESCRIPTIONS = "Na końcu Fazy Zepsucia, po umieszczeniu żetonów Zepsucia, ale prezed sprawdzaniem warunków Spustaszenia, usuń wszystkie swoje figurki z tego regionu. Umieść jeden żetoz Zepsucia za każde dwie figurki które usunołeś w ten sposób..";
    static String SMELL_OF_DEATH_DESCRIPTIONS = "Jeśli zdominujesz ten region, umieść na nim dwea żetony Zepsucia.";

    /**
     * variable is final because all of KhronCards have not magicSymbol.
     */
}
