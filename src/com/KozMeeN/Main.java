package com.KozMeeN;

import com.KozMeeN.cards.ChaosCard.ChaosCard;
import com.KozMeeN.champions.Champion;
import com.KozMeeN.champions.KhornChampion;



public class Main {

    public static void main(String[] args) {
        Champion khorn = new KhornChampion();
        int i=0;
        System.out.println("*********************************************************************\nKarty ręka");
            khorn.choseCard(2);
        for(ChaosCard list:khorn.onHandDeck){
            System.out.println(i);
            list.write();
            i++;
        }
        /*System.out.println("*********************************************************************\nKarty Talia");
        for(ChaosCard list:khorn.deck){
            System.out.println(i);
            list.write();
            i++;
        }*/
    }
}
