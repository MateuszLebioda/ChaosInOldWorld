package com.KozMeeN;

import com.KozMeeN.cards.ChaosCard.ChaosCard;
import com.KozMeeN.champions.Champion;
import com.KozMeeN.champions.KhornChampion;
import com.KozMeeN.map.BoxesOnBoard.BoxOnBoard;
import com.KozMeeN.map.MapOfGame;


public class Main {

    public static void main(String[] args) {
        Champion khorn = new KhornChampion();
        MapOfGame map = new MapOfGame();

        /*int i=0;
        for(BoxOnBoard list:map.boxesOnBoard){
            System.out.println(i);
            list.write();
            i++;
        }*/
        int i=0;
        System.out.println("*********************************************************************\nKarty ręka");
            khorn.choseCard(30);
        for(ChaosCard list:khorn.onHandDeck){
            System.out.println(i);
            list.write();
            i++;
        }
        System.out.println("*********************************************************************\nKarty Talia");
        for(ChaosCard list:khorn.deck){
            System.out.println(i);
            list.write();
            i++;
        }
    }
}
