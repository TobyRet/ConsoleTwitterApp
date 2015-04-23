package com.codurance.Actions;

import com.codurance.Console;
import com.codurance.Posts.PostDisplay;
import com.codurance.Repository;

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
