package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private static List<Post> posts = new ArrayList<>();

    public void add(Post post) {
        posts.add(post);
    }

    public List<Post> allPosts() {
        return posts;
    }
}
