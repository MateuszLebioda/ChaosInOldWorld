package com.KozMeeN.game;


import com.KozMeeN.champions.Champion;
import com.KozMeeN.champions.KhornChampion;
import com.KozMeeN.map.MapOfGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Game {

    Random random = new Random();
    public Game(){

         map = new MapOfGame();
         chamionsList.add(new KhornChampion());
         chamionsList.get(0).choseCard(5);
         championPlayCard(chamionsList.get(Champion.KHORN_ID),map,random.nextInt(3),random.nextInt(9));
    }

    private MapOfGame map;
    private List<Champion> chamionsList = new ArrayList<>();


    /**
     * @param champ champion who will play the card
     * @param map map which we use
     * @param cardId which card we want to play
     * @param regionId where we want to play the card
     */
    public void championPlayCard(Champion champ, MapOfGame map,int cardId,int regionId){
        champ.choseCard(2);
        champ.playCard(champ.getOnHandDeckCardById(cardId),map.getRegionById(regionId));

        map.checkAllBox();
    }
}
