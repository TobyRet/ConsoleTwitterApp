package com.codurance.unittests;

import com.codurance.Actions;
import com.codurance.Console;
import com.codurance.Post;
import com.codurance.Repository;

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
            console.print(getUserPosts(userInput));
        }
    }

    private List<Post> getUserPosts(String userInput) {
        return repository.getPostsFor(userInput);
    }
}
