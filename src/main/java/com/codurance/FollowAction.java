package com.codurance;

public class FollowAction implements Actions {

    @Override
    public void execute(String userInput, PostDisplay postDisplay, Repository repository) {
        if (userInput.contains("follows")) {
            follow(userInput, repository);
        }
    }

    private void follow(String userInput, Repository repository) {
        repository.createRelationship(getFollower(userInput), getFollowee(userInput));
    }

    private String getFollowee(String userInput) {
        return userInput.split(" ")[2];
    }

    private String getFollower(String userInput) {
        return userInput.split(" ")[0];
    }
}