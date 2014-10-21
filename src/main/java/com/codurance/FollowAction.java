package com.codurance;

public class FollowAction implements Actions{
    private final Repository repository;

    public FollowAction(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(String userInput) {
        if(userInput.contains("follow")) {
            addFrend(userInput);
        }
    }

    private void addFrend(String userInput) {

    }
}
