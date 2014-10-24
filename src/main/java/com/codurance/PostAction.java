package com.codurance;

public class PostAction implements Actions {

    @Override
    public void execute(String userInput, PostDisplay postDisplay, Repository repository) {
        if (userInput.contains("->")) {
            Post post = new Post(getUser(userInput), getMessage(userInput), new Clock());
            repository.add(post);
        }
    }

    private String getMessage(String userInput) {
        return userInput.split("-> ")[1];
    }

    private String getUser(String userInput) {
        return userInput.split(" ")[0];
    }
}
