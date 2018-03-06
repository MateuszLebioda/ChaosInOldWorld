package com.KozMeeN.token;

import com.KozMeeN.map.BoxesOnBoard.Region;
import com.KozMeeN.map.MapOfGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TokenHolder {
    public TokenHolder(MapOfGame map){
        tokenList = createTokenDeck();
        startRollToken(map);
    }

    private List<Token> tokenList;

    private List<Token> createTokenDeck(){
        List<Token> list = new ArrayList<>();

        addTokens(Token.EVENT_TOKEN_SIZE,EventToken.getInstance(),list);
        addTokens(Token.HERO_TOKEN_SIZE,HeroToken.getInstance(),list);
        addTokens(Token.NOBLE_TOKEN_SIZE,NobleToken.getInstance(),list);
        addTokens(Token.PEASANT_TOKEN_SIZE,PeasantToken.getInstance(),list);
        addTokens(Token.SKAVEN_TOKEN_SIZE,SkavenToken.getInstance(),list);
        addTokens(Token.WARPSTONE_TOKEN_SIZE,WarpstoneToken.getInstance(),list);

        return list;
    }

    private void addTokens(int howMany, Token token, List<Token> list){
        for(int i=0;i<howMany;i++) list.add(token);
    }
    public Token getEventToken(){
        for(Token list:tokenList){
            if(list.name.equals(Token.EVENT_TOKEN_NAME)){
                tokenList.remove(list);
                return list;
            }
        }
        return null;
    }
    public boolean isEventToken(){
        for(Token list:tokenList){
            if(list.name.equals(Token.EVENT_TOKEN_NAME)){
                return true;
            }
        }
        System.err.println("Brak dospępnych " + Token.EVENT_TOKEN_NAME);
        return false;
    }

    public Token getHeroToken(){
        for(Token list:tokenList){
            if(list.name.equals(Token.HERO_TOKEN_NAME)){
                tokenList.remove(list);
                return list;
            }
        }
        return null;
    }
    public boolean isHeroToken(){
        for(Token list:tokenList){
            if(list.name.equals(Token.HERO_TOKEN_NAME)){
                return true;
            }
        }
        System.err.println("Brak dospępnych " + Token.HERO_TOKEN_NAME);
        return false;
    }

    public Token getNobleToken(){
        for(Token list:tokenList){
            if(list.name.equals(Token.NOBLE_TOKEN_NAME)){
                tokenList.remove(list);
                return list;
            }
        }
        return null;
    }
    public boolean isNobleToken(){
        for(Token list:tokenList){
            if(list.name.equals(Token.NOBLE_TOKEN_NAME)){
                return true;
            }
        }
        System.err.println("Brak dospępnych " + Token.NOBLE_TOKEN_NAME);
        return false;
    }

    public Token getPeasantToken(){
        for(Token list:tokenList){
            if(list.name.equals(Token.PEASANT_TOKEN_NAME)){
                tokenList.remove(list);
                return list;
            }
        }
        return null;
    }
    public boolean isPeasantToken(){
        for(Token list:tokenList){
            if(list.name.equals(Token.PEASANT_TOKEN_NAME)){
                return true;
            }
        }
        System.err.println("Brak dospępnych " + Token.PEASANT_TOKEN_NAME);
        return false;
    }

    public Token getSkavenToken(){
        for(Token list:tokenList){
            if(list.name.equals(Token.SKAVEN_TOKEN_NAME)){
                tokenList.remove(list);
                return list;
            }
        }
        return null;
    }
    public boolean isSkavenToken(){
        for(Token list:tokenList){
            if(list.name.equals(Token.SKAVEN_TOKEN_NAME)){
                return true;
            }
        }
        System.err.println("Brak dospępnych " + Token.SKAVEN_TOKEN_NAME);
        return false;
    }

    public Token getWarpstoneToken(){
        for(Token list:tokenList){
            if(list.name.equals(Token.WARPSTONE_TOKEN_NAME)){
                tokenList.remove(list);
                return list;
            }
        }
        return null;
    }
    public boolean isWarpstoneToken(){
        for(Token list:tokenList){
            if(list.name.equals(Token.WARPSTONE_TOKEN_NAME)){
                return true;
            }
        }
        System.err.println("Brak dospępnych " + Token.WARPSTONE_TOKEN_NAME);
        return false;
    }

    public void startRollToken(MapOfGame map){
        List<Token>temporaryList = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<4;i++){ if(isPeasantToken())temporaryList.add(getPeasantToken()); }
        for(int i=0;i<3;i++){ if(isWarpstoneToken())temporaryList.add(getWarpstoneToken()); }
        for(int i=0;i<2;i++){ if(isNobleToken())temporaryList.add(getNobleToken()); }
        for(Region region:map.getAllRegions()){
            region.addToTokenList(temporaryList.get(random.nextInt(temporaryList.size())));
        }
    }


}
