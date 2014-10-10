package com.codurance;

public class Post implements Actions {

    @Override
    public void checkIfValidRequest(String userInput) {
        if (userInput.contains("->")) {
            this.execute(userInput);
        };
    }

    public String execute(String userInput) {
        return getName(userInput);
    }

    private String getName(String userInput) {
        String[] splitUserInput = userInput.split(" ");
        return splitUserInput[0];
    }
}
