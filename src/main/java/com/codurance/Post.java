package com.codurance;

public class Post {
    private final String message;
    private final String user;
    private String dateTimeStamp;

    public Post(String user, String message, String dateTimeStamp) {
        this.user = user;
        this.message = message;
        this.dateTimeStamp = dateTimeStamp;
    }

    public String getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }

    public String getDateTimeStamp() {
        return dateTimeStamp;
    }
}
