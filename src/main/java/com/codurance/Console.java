package com.codurance;

import java.util.List;

public class Console {
    private Twitter twitter;

    public Console(Twitter twitter) {
        this.twitter = twitter;
    }

    public void print(List<String> post) {

    }

    public void storeInput(String post) {
        twitter.handleUserRequest(post);
    }
}
