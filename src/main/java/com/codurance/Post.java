package com.codurance;

import java.time.LocalDateTime;

public class Post implements Comparable<Post> {
    private final String message;
    private final String user;
    private final LocalDateTime localDateTime;

    public Post(String user, String message, Clock clock) {
        this.user = user;
        this.message = message;
        this.localDateTime = clock.getLocalDateTime();
    }

    public String getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getDateTimeStamp() {
        return localDateTime;
    }

    @Override
    public int compareTo(Post anotherPost) {
        return this.localDateTime.compareTo(anotherPost.localDateTime);
    }
}
