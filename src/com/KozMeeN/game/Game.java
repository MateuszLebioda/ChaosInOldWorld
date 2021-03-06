package com.KozMeeN.game;


import com.KozMeeN.cards.ChaosCard.ChaosCard;
import com.KozMeeN.champions.Champion;
import com.KozMeeN.champions.KhorneChampion;
import com.KozMeeN.map.BoxesOnBoard.Region;
import com.KozMeeN.map.MapOfGame;
import com.KozMeeN.token.*;

import java.util.ArrayList;
import java.util.List;


public class Game {

    public Game(){
         map = new MapOfGame();
         chamionsList.add(new KhorneChampion());
         Champion khorn = chamionsList.get(Champion.KHORNE_ID);
         tokenHolder = new TokenHolder(map);
         play();
    }

    private MapOfGame map;
    private List<Champion> chamionsList = new ArrayList<>();
    private TokenHolder tokenHolder;


    public void play(){
        for(Region list:map.getAllRegions()){
            list.writeTokens();
        }
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
