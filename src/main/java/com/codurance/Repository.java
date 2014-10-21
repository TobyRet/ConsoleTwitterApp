package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private List<Post> posts = new ArrayList<>();

    public void add(Post post) {
        posts.add(post);
    }

    public List<String> getPostsFor(String user) {
        List<String> userPosts = new ArrayList<>();
        for(Post post : posts) {
            if(post.getUser() == user) {
                userPosts.add(post.getUser() + " - " + post.getMessage());
            }
        }
        return userPosts;
    }
}
