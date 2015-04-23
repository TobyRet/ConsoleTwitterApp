package com.codurance.Actions;

import com.codurance.Posts.PostDisplay;
import com.codurance.Repository;

public interface Actions {
    void execute(String userInput, PostDisplay postDisplay, Repository repository);
}
