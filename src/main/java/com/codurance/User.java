package com.codurance;

import java.util.*;

public class User {
    private final String name;
    private List<Object> allPosts = new ArrayList();

    public User(String name) {
        this.name = name;
    }

    public void addPost(Post post) {
        Map<String, Post> postEntry = new HashMap<>();
        postEntry.put("Post", post);

        List<Object> entry = new ArrayList<>();
        entry.add(postEntry);
        allPosts.add(entry);

    }

    public List<Object> getAllPosts() {
        return allPosts;
    }
}