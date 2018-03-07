package com.KozMeeN.figurine.NurgleFigurine;

import com.KozMeeN.figurine.Figurine;

public abstract class NurgleFigurine extends Figurine {
    public static String CULTIST_NAME = "Trędowaty";
    public static String WARRIOR_NAME = "Siewca Zarazy";
    public static String BOS_NAME = "Wielki Nieczysty";

    protected static String CULTIST_DESCRIPTION = "Koszt przyzwania Trędowatego do regionu, w którym nie posiadasz swoich figurek, wynosi 0. Każdy Trędwowaty może byc przyzwany za darmo raz na rndę.";
    protected static String WARRIOR_DESCRIPTION = "Kiedy przeciwnik zabije w walce jednego lub więcej twoich Siewców Zarazy, zadaj tyle obrażen ilu zgineło Siewców Zarazy figurkom tego przeciwnika, znajdującym sie w tym regionie. .";
    protected static String BOS_DESCRIPTION = "Umieść natychmiast dwa żetony Zepsucia w regionie, do którego przyzwałeś Wielkiego Nieczystego.";
}
