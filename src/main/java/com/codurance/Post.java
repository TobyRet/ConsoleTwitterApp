package com.codurance;

public class Post {
    private final String message;
    private final String user;

    public Post(String user, String message) {
        this.user = user;
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }
}
