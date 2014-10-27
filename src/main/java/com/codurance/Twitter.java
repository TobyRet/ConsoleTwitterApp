package com.codurance;

import java.time.LocalDateTime;

public class Twitter {
    private final Repository repository;
    private final PostDisplay postDisplay;
    private Actions actions;

    public Twitter(Actions actions, Console console) {
        this.actions = actions;
        this.repository = new Repository();
        this.postDisplay = new PostDisplay(new Clock(LocalDateTime.now()));
    }

    public void handleUserRequest(String userInput) {
        actions.execute(userInput, postDisplay, repository);
    }
}
