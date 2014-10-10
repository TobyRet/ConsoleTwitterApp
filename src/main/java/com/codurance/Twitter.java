package com.codurance;

public class Twitter {
    private Actions actions;

    public Twitter(Actions actions) {
        this.actions = actions;
    }

    public void handleUserRequest(String userInput) {
        actions.checkIfValidRequest(userInput);
    }
}
