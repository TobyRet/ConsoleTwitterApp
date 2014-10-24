package com.codurance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
public class Repository {

    private List<Post> posts = new ArrayList<>();
    private Map<String, List<String>> followRelationships = new HashMap<>();

    public void add(Post post) {
        posts.add(post);
    }

    public List<Post> allPosts() {
        return posts;
    }

//    public void createRelationship(String follower, String followee) {
//        editExistingRelationship(follower, followee);
//        createNewRelationshipIfNoneExists(follower, followee);
//    }
//
//    private void createNewRelationshipIfNoneExists(String follower, String followee) {
//        if(followRelationships.containsKey(follower) == false) {
//            followRelationships.put(follower, new ArrayList());
//            followRelationships.get(follower).add(followee);
//        }
//    }
//
//    private void editExistingRelationship(String follower, String followee) {
//        for(Map.Entry<String, List<String>> followRelationship : followRelationships.entrySet()) {
//            if(followRelationship.getKey() == follower) {
//                followRelationship.getValue().add(followee);
//            }
//        }
//    }
//
//    public Map<String, List<String>> getRelationships() {
//        return followRelationships;
//    }
//
//    public List<Post> getPostsFor(String user) {
//        return null;
//    }
//
//    public List<Post> getWallPostsFor(String user) {
//        return null;
//    }
//
//    //        List<String> formattedWallPosts = new ArrayList();
////        List<String> targetUsers = getTargetUsers(user);
////        targetUsers.stream().forEach(user1 -> wallPosts.addAll(repository.postsFor(user1)));
//    // return wallPosts.stream().sorted().collect(Collectors.toList());
//
//    //
////    private List<String> getTargetUsers(String user) {
////        List<String> targetUsers = new ArrayList<>();
////        for(Map.Entry<String, List<String>> followRelationship : repository.getRelationships().entrySet()) {
////            if(followRelationship.getKey() == user) {
////                targetUsers.add(user);
////                for(String followee : followRelationship.getValue()) {
////                    targetUsers.add(followee);
////                };
////            }
////        }
////        return targetUsers;
////    }
}
