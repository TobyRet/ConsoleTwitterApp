package com.codurance;

import java.time.LocalDateTime;

public class PostAction implements Actions {

    @Override
    public void execute(String userInput, PostDisplay postDisplay, Repository repository) {
        if (commandValid(userInput)) {
            Post post = new Post(getUser(userInput), getMessage(userInput), new Clock(LocalDateTime.now()));
            repository.add(post);
        }
    }

    private boolean commandValid(String userInput) {
        return userInput.contains("->");
    }

    private String getMessage(String userInput) {
        return userInput.split("-> ")[1];
    }

    private String getUser(String userInput) {
        return userInput.split(" ")[0];
    }
}
