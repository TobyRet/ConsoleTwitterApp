package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String name;
    private List<Post> posts = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public List<Post> getPosts() {
        return posts;
    }
}
