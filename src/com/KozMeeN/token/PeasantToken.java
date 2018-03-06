package com.KozMeeN.token;

public class PeasantToken extends Token {

    private PeasantToken(){
        name = Token.PEASANT_TOKEN_NAME;
        description = Token.PEASANT_TOKEN_DESCRIPTION;
    }
    public static PeasantToken getInstance(){
        return new PeasantToken();
    }
    @Override
    public void play() {

    }
}
