package com.KozMeeN;

import com.KozMeeN.cards.ChaosCard;
import com.KozMeeN.champions.Champion;
import com.KozMeeN.champions.KhornChampion;



public class Main {

    public static void main(String[] args) {
        Champion khorn = new KhornChampion();
        int i=0;
        for(ChaosCard list:khorn.deck){
            System.out.println(i);
            list.write();
            i++;
        }
    }
}
