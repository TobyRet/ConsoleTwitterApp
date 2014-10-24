//package com.codurance;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class PostFormatter {
//
//    private final Repository repository;
//    private List<String> formattedPosts;
//    private Clock clock;
//
//    public PostFormatter(Repository repository) {
//        this.repository = repository;
//    }
//
//    public List<String> getFormmattedPostsFor(String user) {
//        formattedPosts = new ArrayList();
//        repository.getPostsFor(user).forEach(this::formatPost);
//        return formattedPosts;
//    }
//
//    public List<String> getWallPostsFor(String user) {
//        formattedPosts = new ArrayList();
//        repository.getWallPostsFor(user).forEach(this::formatPost);
//        return formattedPosts;
//    }
//
//    private void formatPost(Post post) {
//        formattedPosts.add(post.getUser() + " - " + post.getMessage() + " " + "(" + timeDifference(post) + " minutes ago)");
//    }
//
//    private String timeDifference(Post post) {
//        clock = new Clock();
//        return clock.getTimeDifference(post.getDateTimeStamp());
//    }
//}
