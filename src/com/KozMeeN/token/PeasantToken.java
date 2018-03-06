package com.KozMeeN.token;

public class PeasantToken extends Token {

    private PeasantToken(){
        name = Token.PEASANT_TOCKEN_NAME;
        description = Token.PEASANT_TOCKEN_DESCRIPTION;
    }
    public static PeasantToken getInstance(){
        return new PeasantToken();
    }
    @Override
    public void play() {

    }
}
