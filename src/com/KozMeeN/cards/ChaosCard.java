package com.KozMeeN.cards;

public abstract class ChaosCard {

    protected int manaCost;
    protected boolean nowUse=false;
    protected boolean fightUse=false;
    protected boolean dominationUse=false;
    protected String name;
    protected String descriptions;
    protected boolean magicSymbol;

    /**
     * method will be use when we play the card.
     */
    public static ChaosCard getCard() {
        return null;
    }

    public abstract void play();

    public void write(){
        System.out.println("Name:" + name);
        System.out.println("Descriptions: " + descriptions);
        System.out.println("Mana cost: " + manaCost);
        if(magicSymbol) System.out.println("Magic symbol");

        System.out.println("Uses: ");
        if(nowUse) System.out.println("After use");
        if(fightUse) System.out.println("Fight use");
        if(dominationUse) System.out.println("Dominations Use");
    }
}
