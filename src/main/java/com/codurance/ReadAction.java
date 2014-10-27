package com.codurance;

public class ReadAction implements Actions {

    @Override
    public void execute(String userInput, PostDisplay postDisplay, Repository repository) {
        if(userInput.split(" ").length == 1) {
            postDisplay.displayAll(repository.getPostsFor(userInput), new Console());
        }
    }
}
