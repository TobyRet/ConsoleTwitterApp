package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private List<Post> posts = new ArrayList<>();

    public void add(Post post) {
        posts.add(post);
    }

    public List<Post> getPostsFor(String user) {
        List<Post> userPosts = new ArrayList<>();
        for(Post post : posts) {
            if(post.getUser() == user) {
                userPosts.add(post);
            }
        }
        return userPosts;
    }
}
