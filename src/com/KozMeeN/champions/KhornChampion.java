package com.KozMeeN.champions;

import com.KozMeeN.cards.ChaosCard.ChaosCard;
import com.KozMeeN.cards.ChaosCard.ChaosCardKhorn.*;

import java.util.ArrayList;
import java.util.List;

public class KhornChampion extends Champion {

    public KhornChampion(){
      name = Champion.KHORN_NAME;
      startAbilityPoints = 7;
      abilityPoints = startAbilityPoints;
      valuesOfDangerPoints = new int[]{3, 6, 12, 14, 17, 23, 28, 31, 32, 100};
      indexOfDangerPoints = 0;
      deck = getDeck();
      dangerPoints = valuesOfDangerPoints[indexOfDangerPoints];
      winPoints = 0;
    }

    /**
     * method create a deck to proper champion.
     * @return deck
     */
    @Override
    public List<ChaosCard> getDeck(){
      List<ChaosCard> deck = new ArrayList<ChaosCard>();

      addCard(4, BloodyCrazeKhornChaosCard.getCard(),deck);
      addCard(4, WarCryKhornChaosCard.getCard(),deck);
      addCard(4, ThroneOfSkullsKhornChaosCard.getCard(),deck);
      addCard(3, MassacreAreaKhornChaosCard.getCard(),deck);
      addCard(3, RitualMorderKhornChaosCard.getCard(),deck);
      addCard(3, RebithInTheBloodKhornChaosCard.getCard(),deck);
      addCard(3, CallOfTheGodKhornChaosCard.getCard(),deck);

      return deck;
    }


    /**
     * need to add Uni tests!!!! when methods will be end.
     * @param indexOfDangerPoints is a value of how many times u turn yours championsWheel.
     */
    @Override
    void dangerPointsProfit(int indexOfDangerPoints) {
        switch (indexOfDangerPoints){
            case 0:

            /**
             * Champions get 4 WinPoints;
             * DONE!!!!
             */
            case 1: // pz 4
            case 4:{
                increaseWinPoints(4);
                break;
            }

            /**
             * Champions get ProgressCard;
             * NOT DONE!!!
             */
            case 2: //karta rozowju
            case 5:
            case 6:{
                break;
            }

            /**
             * Champion get 2 ChaosCards.
             * DONE!
             */
            case 3:
            case 7:
            case 8:{
                choseCard(2);
                break;
            }
            /**
             * Champion get win game on WinPoints way.
             * DONE!
             */
            case 9: //win
        }
    }
}
