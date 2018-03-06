package com.KozMeeN.token;

public class NobleToken extends Token{

    private NobleToken(){
        name = Token.NOBLE_TOKEN_NAME;
        description = Token.NOBLE_TOKEN_DESCRIPTION;
    }
    public static NobleToken getInstance(){
        return new NobleToken();
    }

    @Override
    public void play() {

    }
}
