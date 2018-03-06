package com.KozMeeN.token;

/**
 * Every single region can have inside token, which can decrement resistanceValue, or increment conquestValue.
 * @author KozMeeN created on 6.03.2018
 */
public abstract class Token {
    /**
     * Names of tokens.
     */
    public static String HERO_TOKEN_NAME = "Żeton bohaterów";
    public static String EVENT_TOKEN_NAME = "Żeton wydarzeń";
    public static String NOBLE_TOKEN_NAME = "Żeton szlachty";
    public static String PEASANT_TOKEN_NAME = "Żeton chłopów";
    public static String SKAVEN_TOKEN_NAME = "Żeton Skavenów";
    public static String WARPSTONE_TOKEN_NAME = "Żeton spaczenia";

    public static String HERO_TOKEN_DESCRIPTION = "Eliminują z regionu figurkę gracza pasiadającego największe zagrożenie w tym regionie.";
    public static String EVENT_TOKEN_DESCRIPTION = "Oznacza region, na który wpływają efekty kart starego świata.";
    public static String NOBLE_TOKEN_DESCRIPTION = "Podnosi wartość Podboju regionu o jeden.";
    public static String PEASANT_TOKEN_DESCRIPTION = "Cel w walce z obroną 1, zabierany po zabiciu.";
    public static String SKAVEN_TOKEN_DESCRIPTION = "Zmnijesza opór regionu o jeden.";
    public static String WARPSTONE_TOKEN_DESCRIPTION = "Liczy się jak żeton Zepsucia w tym regionie.";

    public static int HERO_TOKEN_SIZE = 4;
    public static int EVENT_TOKEN_SIZE = 6;
    public static int NOBLE_TOKEN_SIZE = 6;
    public static int PEASANT_TOKEN_SIZE = 20;
    public static int SKAVEN_TOKEN_SIZE = 6;
    public static int WARPSTONE_TOKEN_SIZE = 14;

    public static Token getInstnce(){return null;}

    protected String name;

    public String  getName() {
        return name;
    }

    protected String description;

    public boolean isImmediately(){
        return true;
    }

    public abstract void play();
}
