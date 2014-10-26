package com.codurance;

import java.util.*;
import java.util.stream.Collectors;


public class Repository {

    private List<Post> posts = new ArrayList<>();
    private Map<String, List<String>> followRelationships = new HashMap<>();

    public void add(Post post) {
        posts.add(post);
    }

    public List<Post> getPostsFor(String userName) {
        List<Post> userPosts = posts.stream().
                                filter(post -> post.getUser() == userName).
                                collect(Collectors.toList());
        return userPosts;
    }

    public void createRelationship(String follower, String followee) {
        editExistingRelationship(follower, followee);
        createNewRelationshipIfNoneExists(follower, followee);
    }

    private void editExistingRelationship(String follower, String followee) {
        followRelationships.entrySet().stream().filter(followRelationship -> followRelationship.getKey() == follower).forEach(followRelationship -> {
            followRelationship.getValue().add(followee);
        });
    }

    private void createNewRelationshipIfNoneExists(String follower, String followee) {
        if(followRelationships.containsKey(follower) == false) {
            followRelationships.put(follower, new ArrayList());
            followRelationships.get(follower).add(followee);
        }
    }

    public Map<String, List<String>> getRelationships() {
        return followRelationships;
    }

    public List<Post> getWallPostsFor(String targetUser) {
        List<Post> wallPosts = new ArrayList<>();
        List<String> targetUsers = getFriendsFor(targetUser);

        targetUsers.stream().forEach(user -> wallPosts.addAll(getPostsFor(user)));
        return wallPosts.stream().sorted().collect(Collectors.toList());
    }

    private List<String> getFriendsFor(String targetUser) {
        List<String> targetUsers = new ArrayList<>();
        getRelationships().entrySet().stream().filter(friendsGroup -> friendsGroup.getKey() == targetUser).forEach(friendsGroup -> {
            targetUsers.add(targetUser);
            targetUsers.addAll(friendsGroup.getValue().stream().collect(Collectors.toList()));
        });
        return targetUsers;
    }
}
