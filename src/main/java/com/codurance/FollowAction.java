package com.codurance;

public class FollowAction implements Actions {
    private final Repository repository;

    public FollowAction(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(String userInput) {
        if (userInput.contains("follow")) {
            follow(userInput);
        }
    }

    private void follow(String userInput) {
        repository.createRelationship(getFollower(userInput), getFollowee(userInput));
    }

    private String getFollowee(String userInput) {
        return userInput.split(" follow ")[1];
    }

    private String getFollower(String userInput) {
        return userInput.split(" follow ")[0];
    }
}