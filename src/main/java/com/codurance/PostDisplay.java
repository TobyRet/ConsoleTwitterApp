package com.codurance;

import java.util.List;

public class PostDisplay {

    private final Clock clock;

    public PostDisplay(Clock clock) {
        this.clock = clock;
    }

    public void displayAll(List<Post> posts, Console console) {
        for(Post post : posts) {
            console.print(format(post));
        }
    }

    private String format(Post post) {
       return post.getUser() + " - " + post.getMessage() + " " + "(" + getTimeDifference(post) + " minutes ago)";
    }

    private String getTimeDifference(Post post) {
        return clock.getTimeDifference(post.getDateTimeStamp());
    }
}