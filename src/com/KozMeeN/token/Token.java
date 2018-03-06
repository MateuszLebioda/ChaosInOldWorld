package com.KozMeeN.token;

/**
 * Every single region can have inside token, which can decrement resistanceValue, or increment conquestValue.
 * @author KozMeeN created on 6.03.2018
 */
public abstract class Token {
    /**
     * Names of tokens.
     */
    public static String HERO_TOKEN = "Żeton bohaterów";
    public static String EVENT_TOKEN = "Żeton wydarzeń";
    public static String NOBLE_TOKEN = "Żeton szlachty";
    public static String PEASANT_TOCKEN = "Żeton chłopów";
    public static String SKAVEN_TOKEN = "Żeton Skavenów";
    public static String WARPSTOPE_TOKEN = "Żeton spaczenia";

    private int howMany;

    public abstract void play();

}
