package com.KozMeeN.champions;

import com.KozMeeN.cards.ChaosCardKhorn.*;

public class KhornChampion extends Champion {

    public KhornChampion(){
      name = "Khorn";
      startAbilityPoints = 7;
      for(int i=0;i<4;i++,deck.add(BloodyCrazeKhornChaosCard.getCard()));
      for(int i=0;i<3;i++,deck.add(MassacreAreaKhornChaosCard.getCard()));
      for(int i=0;i<4;i++,deck.add(WarCryKhornChaosCard.getCard()));
      for(int i=0;i<3;i++,deck.add(RitualMorderKhornChaosCard.getCard()));
      for(int i=0;i<4;i++,deck.add(ThroneOfSkullsKhornChaosCard.getCard()));
      for(int i=0;i<3;i++,deck.add(RebithInTheBloodKhornChaosCard.getCard()));
      for(int i=0;i<3;i++,deck.add(CallOfTheGodKhornChaosCard.getCard()));
    }
}
