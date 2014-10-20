package com.codurance.unittests;

import com.codurance.Actions;
import com.codurance.Repository;

public class WallAction implements Actions {
    private final Repository repository;

    public WallAction(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(String userInput) {
        if(userInput.split(" ").length == 1) {
            repository.getPosts();
        }
    }
}
