package com.KozMeeN.game;


import com.KozMeeN.cards.ChaosCard.ChaosCard;
import com.KozMeeN.champions.Champion;
import com.KozMeeN.champions.KhornChampion;
import com.KozMeeN.map.BoxesOnBoard.Region;
import com.KozMeeN.map.MapOfGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Game {

    Random random = new Random();
    public Game(){

         map = new MapOfGame();
         chamionsList.add(new KhornChampion());
         Champion khorn = chamionsList.get(Champion.KHORN_ID);
         play();
    }

    private MapOfGame map;
    private List<Champion> chamionsList = new ArrayList<>();

    void play(){
        int i = 0;
        while(chamionsList.get(Champion.KHORN_ID).canPlay()){
            chamionsList.get(Champion.KHORN_ID).choseCard(1);
            chamionsList.get(Champion.KHORN_ID).playCard(chamionsList.get(Champion.KHORN_ID).getOnHandDeckCardById(0),map.getRegionById(i%9));
            i++;
        }
    }

    public void championPlayCard(Champion champ,ChaosCard card,Region region){

        champ.playCard(champ.getOnHandDeckCardById(0),region);

    }

    void removeAllChaosCards(){
        ChaosCard card;
        for(Region region:map.getAllRegions()) {
            if (region.isBoxOneOccupied()){
               card = region.clearBoxOneCard();
                switch (card.getChampion()) {
                    case "Khorn": {
                      chamionsList.get(0).addCardToThrowDeck(card);
                    }
                }
            }
            if(region.isBoxTwoOccupied()) {
                card = region.clearTwoOneCard();
                switch (card.getChampion()) {
                    case "Khorn": {
                        chamionsList.get(0).addCardToThrowDeck(card);
                    }
                }
            }

        }
    }
}
