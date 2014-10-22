package com.codurance;

import java.util.List;

public class WallAction implements Actions {
    private final PostFormatter postFormatter;
    private final Console console;

    public WallAction(PostFormatter postFormatter, Console console) {
        this.postFormatter = postFormatter;
        this.console = console;
    }

    @Override
    public void execute(String userInput) {
        if(commandValid(userInput)) {
            getWallPostsFromRepository(userInput.split(" ")[0]).forEach(console::print);
        }
    }

    private boolean commandValid(String userInput) {
        return userInput.split(" ")[1].equals("wall");
    }

    private List<String> getWallPostsFromRepository(String user) {
        return postFormatter.getWallPostsFor(user);
    }

}
