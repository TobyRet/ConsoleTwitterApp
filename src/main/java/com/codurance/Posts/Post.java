package com.codurance.Posts;

import java.time.LocalDateTime;
import com.codurance.Time.Clock;

public class Post implements Comparable<Post> {
    private final String message;
    private final String user;
    private final LocalDateTime postCreationDateTime;

    public Post(String user, String message, Clock clock) {
        this.user = user;
        this.message = message;
        this.postCreationDateTime = clock.getLocalDateTime();
    }

    public String getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getPostCreationDateTime() {
        return postCreationDateTime;
    }

    @Override
    public int compareTo(Post anotherPost) {
        return anotherPost.postCreationDateTime.compareTo(this.postCreationDateTime);
    }
}
