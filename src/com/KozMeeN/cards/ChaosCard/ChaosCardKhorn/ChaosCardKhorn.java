package com.KozMeeN.cards.ChaosCard.ChaosCardKhorn;

import com.KozMeeN.cards.ChaosCard.ChaosCard;
import com.KozMeeN.champions.Champion;

abstract class ChaosCardKhorn extends ChaosCard {

    ChaosCardKhorn(){
       magicSymbol = false;
       champion = Champion.KHORN_NAME;
    }
    static String BLOODY_CRAZE = "Krwawy szał";
    static String MASSACRE_AREA = "Obszar rzezi";
    static String WAR_CRY = "Okrzyk wojenny";
    static String RITUAL_MURDER = "Rytualny mord";
    static String THRONE_OF_SKULLS = "Tron czaszek";
    static String REBIRTH_IN_THE_BLOOD = "Odrodzenie we krwi";
    static String CALL_OF_THE_GOD = "Zew Boga Krwi";

    static String BLOODY_CRAZE_DESCRIPTIONS = "Na początku walki w tym regionie, rzuć dwiema koścmi, przydziel obrażenia i zabij ewntualne ofiary przed normalnymi rzutami kośćmi.";
    static String MASSACRE_AREA_DESCRIPTIONS = "Żadne figurki, poza twoimi, nie mogą być przyzwane z tego regionu do czasu usunięcia stąd tej karty.";
    static String WAR_CRY_DESCRIPTIONS = "Podczas tej rundy nie możesz umieszczać żetonów Zepsucia w tym regionie.";
    static String RITUAL_MURDER_DESCRIPTIONS = "Za każdym razem gdy zabijesz figurkę w tym regionie, dobierz kartę.";
    static String THRONE_OF_SKULLS_DESCRIPTIONS = "Przy obliczaniu dominacji w tym regionie, użyj sumy wrtości ataku twoich figurek zamiast ilości twoich figurek.";
    static String REBIRTH_IN_THE_BLOOD_DESCRIPTIONS = "Przeprowadz dodatkową faze walki w tym regionie.";
    static String CALL_OF_THE_GOD_DESCRIPTIONS = "Po zagraniu tej karty, natychmiast przenieść do dwóch figurek z innego regionu do tego regionu.";


    /**
     * variable is final because all of KhronCards have not magicSymbol.
     */
}
