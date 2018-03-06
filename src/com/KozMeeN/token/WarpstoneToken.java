package com.KozMeeN.token;

public class WarpstoneToken extends Token {
    private WarpstoneToken(){
        name = Token.WARPSTONE_TOKEN_NAME;
        description = Token.WARPSTONE_TOKEN_DESCRIPTION;
    }

    public static WarpstoneToken getInstance(){
        return new WarpstoneToken();
    }

    @Override
    public void play() {

    }
}
