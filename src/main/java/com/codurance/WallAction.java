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
        if(userInput.split(" ").length == 1) {
            getPostsFromRepository(userInput).forEach(console::print);
        }
    }

    private List<String> getPostsFromRepository(String userInput) {
        return postFormatter.getPostsFor(userInput);
    }
}
