package com.codurance;

public class Post {
    private final String message;
    private final String user;
    private DateTimeStamp dateTimeStamp;

    public Post(String user, String message, DateTimeStamp dateTimeStamp) {
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

    public DateTimeStamp getDateTimeStamp() {
        return dateTimeStamp;
    }
}
