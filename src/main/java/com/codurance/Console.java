package com.codurance;

import java.util.List;
import java.util.Map;

public class Console {
    private Twitter twitter;

    public Console(Twitter twitter) {
        this.twitter = twitter;
    }

    public void print(String post) {

    }

    public void storeInput(String post) {
        twitter.handleUserRequest(post);
    }
}
