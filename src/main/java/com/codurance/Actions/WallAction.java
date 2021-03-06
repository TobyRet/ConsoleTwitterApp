package com.codurance.Actions;

import com.codurance.Console;
import com.codurance.Posts.PostDisplay;
import com.codurance.Repository;

public class WallAction implements Actions {

    @Override
    public void execute(String userInput, PostDisplay postDisplay, Repository repository) {
        if(commandValid(userInput)) {
            postDisplay.displayAll(repository.getWallPostsFor(getUser(userInput)), new Console());
        }
    }

    private String getUser(String userInput) {
        return userInput.split(" ")[0];
    }

    private boolean commandValid(String userInput) {
        return userInput.contains("wall");
    }

}
