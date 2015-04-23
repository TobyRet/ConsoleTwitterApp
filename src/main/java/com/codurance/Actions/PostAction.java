package com.codurance.Actions;

import java.time.LocalDateTime;
import com.codurance.Time.Clock;
import com.codurance.Posts.Post;
import com.codurance.Posts.PostDisplay;
import com.codurance.Repository;

public class PostAction implements Actions {

    @Override
    public void execute(String userInput, PostDisplay postDisplay, Repository repository) {
        if (commandValid(userInput)) {
            Post post = new Post(getUser(userInput), getMessage(userInput), new Clock(LocalDateTime.now()));
            repository.add(post);
        }
    }

    private boolean commandValid(String userInput) {
        return userInput.contains("->");
    }

    private String getMessage(String userInput) {
        return userInput.split("-> ")[1];
    }

    private String getUser(String userInput) {
        return userInput.split(" ")[0];
    }
}
