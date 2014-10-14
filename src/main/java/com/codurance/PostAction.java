package com.codurance;

public class PostAction implements Actions {

    private Repository repository;

    public PostAction(Repository repository) {
        this.repository = repository;
    }

    public void execute(String userInput) {
        if (userInput.contains("->")) {
            User user = retrieveUserAccount(userInput);
            user.addPost(createPost(userInput));
        }
    }

    private Post createPost(String userInput) {
        return new Post(getMessage(userInput));
    }

    private String getMessage(String userInput) {
        return userInput.split("-> ")[1];
    }

    private User retrieveUserAccount(String userInput) {
        return repository.findOrCreate(getUserName(userInput));
    }

    private String getUserName(String userInput) {
        return userInput.split(" ")[0];
    }

}
