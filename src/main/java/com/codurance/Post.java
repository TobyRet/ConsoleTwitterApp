package com.codurance;

public class Post implements Actions {

    private Repository repository;

    public Post(Repository repository) {
        this.repository = repository;
    }

    public void checkIfValidRequest(String userInput) {
        if (userInput.contains("->")) {
            execute(userInput);
        }
    }

    public void execute(String userInput) {
        User user = getOrCreateUser(userInput);
    }

    public User getOrCreateUser(String userInput) {
        return repository.findOrCreate(extractNameFromInput(userInput));
    }

    public String extractNameFromInput(String userInput) {
        String[] splitUserInput = userInput.split(" ");
        return splitUserInput[0];
    }

    public String extractPostFromInput(String userInput) {
        String[] splitUserInput = userInput.split("-> ");
        return splitUserInput[1];
    }
}
