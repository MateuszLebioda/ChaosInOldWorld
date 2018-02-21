package com.KozMeeN.champions;

import com.KozMeeN.cards.ChaosCard;

import java.util.ArrayList;
import java.util.List;

public abstract class Champion {

    protected String name;

    final int maxAbilityPoints = 12;
    protected int startAbilityPoints;
    private int abilityPointions;

    public List<ChaosCard> deck = new ArrayList<ChaosCard>();

    private int winPoints;

    private int dangerPoints;

    private void choseCard(){}
    private void increaseDangerPoints(){}
    private void increaseWinPoints(){}
    private void playCard(){}
    private void playMonster(){}
    private void pass(){}
    private void turnWheel(){}
}
