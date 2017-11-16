package com.greenfox.barbara.p2pchat;

/**
 * Created by Barbara on 16/11/2017.
 */

public class Message {

    String username;
    String text;

    public Message(String username, String text) {
        this.username = username;
        this.text = text;
    }

    public Message() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
