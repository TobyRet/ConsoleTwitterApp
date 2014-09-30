package com.codurance;

public class Twitter {
    private Actions actions;

    public Twitter(Actions actions) {
        this.actions = actions;
    }

    public void acceptUserRequest(String userInput) {
        actions.execute(userInput);
    }
}
