package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class PostFormatter {

    private final Repository repository;

    public PostFormatter(Repository repository) {
        this.repository = repository;
    }

    public List<String> getPostsFor(String user) {
        List<String> userPosts = new ArrayList();
        for(Post post : repository.allPosts()) {
            if(post.getUser() == user) {
                userPosts.add(post.getUser() + " - " + post.getMessage() + " " + "(" + post.getDateTimeStamp().getTimeDifference() + " minutes ago)");
            }
        }
        return userPosts;
    }

    public List<String> getWallPostsFor(String user) {
        return null;
    }
}
