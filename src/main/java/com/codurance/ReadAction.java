package com.codurance;

public class ReadAction implements Actions {

    @Override
    public void execute(String userInput, PostDisplay postDisplay, Repository repository) {
        if(commandValid(userInput)) {
            postDisplay.displayAll(repository.getPostsFor(userInput), new Console());
        }
    }

    private boolean commandValid(String userInput) {
        return userInput.split(" ").length == 1;
    }
}
