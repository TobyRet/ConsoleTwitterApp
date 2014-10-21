package com.codurance;

import java.util.List;

public class WallAction implements Actions {
    private final Repository repository;
    private final Console console;

    public WallAction(Repository repository, Console console) {
        this.repository = repository;
        this.console = console;
    }

    @Override
    public void execute(String userInput) {
        if(userInput.split(" ").length == 1) {
            getPostsFromRepository(userInput).forEach(console::print);
        }
    }

    private List<String> getPostsFromRepository(String userInput) {
        return repository.getPostsFor(userInput);
    }
}
