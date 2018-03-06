package com.KozMeeN.token;

public class HeroToken extends Token {

    private HeroToken(){
        name = Token.HERO_TOKEN_NAME;
        description = Token.HERO_TOKEN_DESCRIPTION;
    }

    public static HeroToken getInstance(){
        return new HeroToken();
    }

    @Override
    public boolean isImmediately(){
        return false;
    }

    @Override
    public void play() {

    }
}
