//package com.codurance;
//
//import java.util.List;
//
//public class ReadAction implements Actions {
//
//    @Override
//    public void execute(String userInput, Twitter twitter) {
//        if(userInput.split(" ").length == 1) {
//            twitter.displayPosts(getPostsFromRepository(userInput, twitter));
//        }
//    }
//
//    private List<Post> getPostsFromRepository(String user, Twitter twitter) {
//        return twitter.repository.getPostsFor(user);
//    }
//}
