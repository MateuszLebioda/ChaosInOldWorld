package com.KozMeeN.cards.ChaosCard;

public abstract class ChaosCard {

    protected int abilityPowerCost;

    protected String name;
    protected String descriptions;

    protected String champion;

    protected boolean magicSymbol;

    public String getName(){
        return name;
    }

    /**
     * method return us card of selected type.
     * we do not have to create many object every card of the same type are equals.
     */
    public static ChaosCard getCard() {
        return null;
    }

    /**
     * method dependent on typ of card. Every single type of card will have different way of use, and different effect.
     * so we must define this method in every type of cards singly.
     */
    public abstract void play();

    /**
     * we can show description of the card.
     */
    public void write(){
        System.out.println("Name:" + name);
        System.out.println("Descriptions: " + descriptions);
        System.out.println("Mana cost: " + abilityPowerCost);
        if(magicSymbol) System.out.println("Magic symbol");
    }

    /**
     * @return abilityPowerCost of the card.
     */
    public int getAbilityPowerCost(){
       return abilityPowerCost;
    }

    public String getChampion(){
        return champion;
    }

}
