package com.codurance;

public class Wall implements Actions {
    private final Repository repository;

    public Wall(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void checkIfValidRequest(String userInput) {
        parseCommand(userInput);
    }

    public boolean parseCommand(String userInput) {
        return userInput.split(" ").length == 1;
    }
}
