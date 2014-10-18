package com.codurance;

public class PostAction implements Actions {

    private Repository repository;

    public PostAction(Repository repository) {
        this.repository = repository;
    }

    public void execute(String userInput) {
        if (userInput.contains("->")) {
            Post post = new Post(getUser(userInput), getMessage(userInput));
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
