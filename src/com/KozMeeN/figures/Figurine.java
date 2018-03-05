package com.KozMeeN.figures;

/**
 * @author KozmeeN created on 26.02.2018
 *
 */
public abstract class Figurine {
    public static String CULLTIST_ROLE = "Cultist";
    public static String WARRIOR_ROLE = "Warrior";
    public static String BOS_ROLE = "Bos";

    public Figurine(){
        isUpgraded=false;
    }
    protected String role;
    protected String name;
    protected String champion;
    protected String description;

    protected boolean isUpgraded;

    protected int abilityPowerCost;
    protected int damage;
    protected int armor;

    public abstract void specialEffect();

    public boolean isUpgraded(){
        return isUpgraded;
    }

    public String getRole(){
        return role;
    }

    public int getAbilityPowerCost(){
        return abilityPowerCost;
    }
}
