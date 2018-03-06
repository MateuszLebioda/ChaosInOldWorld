package com.KozMeeN.game;


import com.KozMeeN.cards.ChaosCard.ChaosCard;
import com.KozMeeN.champions.Champion;
import com.KozMeeN.champions.KhornChampion;
import com.KozMeeN.map.BoxesOnBoard.Region;
import com.KozMeeN.map.MapOfGame;
import com.KozMeeN.token.*;

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


    public void play(){
    }

    public void championPlayCard(Champion champ,ChaosCard card,Region region){

        champ.playCard(champ.getOnHandDeckCardById(0),region);

    }

    /**
     * Method wil be use in final phase wen we will remove all cards from every region and put in into throw deck.
     */
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
