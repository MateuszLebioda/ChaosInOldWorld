package com.KozMeeN.token;

public class SkavenToken extends Token {
    private SkavenToken(){
        name = Token.SKAVEN_TOKEN_NAME;
        description = Token.SKAVEN_TOKEN_DESCRIPTION;
    }

    public static SkavenToken getInstance(){
        return new SkavenToken();
    }

    @Override
    public void play() {

    }
}
