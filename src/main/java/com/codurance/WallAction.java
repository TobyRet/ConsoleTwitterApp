package com.codurance;

public class WallAction implements Actions {

    @Override
    public void execute(String userInput, PostDisplay postDisplay, Repository repository) {
        if(commandValid(userInput)) {
            postDisplay.print(repository.getWallPostsFor(userInput));
        }
    }

    private boolean commandValid(String userInput) {
        return userInput.split(" ")[1].equals("wall");
    }

}
