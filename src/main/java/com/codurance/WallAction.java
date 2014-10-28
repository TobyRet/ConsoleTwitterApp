package com.codurance;

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