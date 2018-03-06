package com.KozMeeN.token;

public class EventToken extends Token {
    private EventToken(){
        name = Token.EVENT_TOKEN_NAME;
        description = Token.EVENT_TOKEN_DESCRIPTION;
    }

    public static EventToken getInstance(){
        return new EventToken();
    }
    @Override
    public void play() {

    }
}
