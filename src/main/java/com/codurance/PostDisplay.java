package com.codurance;

import java.time.LocalDateTime;
import java.util.List;

public class PostDisplay {

    private final TimeFormatter timeFormatter;

    public PostDisplay(TimeFormatter timeFormatter) {
        this.timeFormatter = timeFormatter;
    }

    public void displayAll(List<Post> posts, Console console) {
        for(Post post : posts) {
            console.print(format(post));
        }
    }

    private String format(Post post) {
       return post.getUser() + " - " + post.getMessage() + " " + "(" + getTimeDifference(post) + ")";
    }

    private String getTimeDifference(Post post) {
        LocalDateTime timeNow = new Clock(LocalDateTime.now()).getLocalDateTime();
        return timeFormatter.getTimeDifference(post.getPostCreationDateTime(), timeNow);
    }
}