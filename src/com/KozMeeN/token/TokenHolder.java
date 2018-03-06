package com.KozMeeN.token;

import java.util.ArrayList;
import java.util.List;

public class TokenHolder {

    private List<Token> tokenList = new ArrayList<>();

    private void createTokenDeck(){
        for(int i=0;i<Token.EVENT_TOKEN_SIZE;i++,tokenList.add(EventToken.getInstance()));
        for(int i=0;i<Token.HERO_TOKEN_SIZE;i++,tokenList.add(HeroToken.getInstance()));
        for(int i=0;i<Token.NOBLE_TOKEN_SIZE;i++,tokenList.add(NobleToken.getInstance()));
        for(int i=0;i<Token.PEASANT_TOKEN_SIZE;i++,tokenList.add(PeasantToken.getInstance()));
        for(int i=0;i<Token.SKAVEN_TOKEN_SIZE;i++,tokenList.add(SkavenToken.getInstance()));
        for(int i=0;i<Token.WARPSTONE_TOKEN_SIZE;i++,tokenList.add(WarpstoneToken.getInstance()));
    }
    void rollTokens(){
        createTokenDeck();

    }

}
