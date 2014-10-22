package com.codurance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repository {

    private List<Post> posts = new ArrayList<>();
    private Map<String, List<String>> followRelationships = new HashMap<>();
    private boolean existingRelationShipExists = false;

    public void add(Post post) {
        posts.add(post);
    }

    public List<Post> allPosts() {
        return posts;
    }

    public void createRelationship(String follower, String followee) {
        editExistingRelationship(follower, followee);
        createNewRelationshipIfNoneExists(follower, followee);

    }

    private void createNewRelationshipIfNoneExists(String follower, String followee) {
        if(followRelationships.containsKey(follower) == false) {
            followRelationships.put(follower, new ArrayList());
            followRelationships.get(follower).add(followee);
        }
    }

    private void editExistingRelationship(String follower, String followee) {
        for(Map.Entry<String, List<String>> followRelationship : followRelationships.entrySet()) {
            if(followRelationship.getKey() == follower) {
                followRelationship.getValue().add(followee);
            }
        }
    }

    public Map<String, List<String>> getRelationships() {
        return followRelationships;
    }
}
