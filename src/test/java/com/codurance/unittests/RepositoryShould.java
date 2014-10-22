package com.codurance.unittests;

import com.codurance.DateTimeStamp;
import com.codurance.Post;
import com.codurance.Repository;
import org.junit.Before;
import org.junit.Test;

import static java.time.LocalDateTime.now;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.collection.IsMapContaining.hasKey;
import static org.hamcrest.collection.IsMapContaining.hasValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RepositoryShould {

    private Repository repository;

    @Before
    public void initialise() {
        repository = new Repository();
    }
    @Test public void
    return_a_users_posts() {
        Post alicePost = new Post("Alice", "Blah", new DateTimeStamp(now()));
        Post fredPost = new Post("Fred", "Blah", new DateTimeStamp(now()));
        Post ottoPost = new Post("Otto", "Blah", new DateTimeStamp(now()));

        repository.add(alicePost);
        repository.add(fredPost);
        repository.add(ottoPost);

        assertThat(repository.allPosts().size(), is(3));
    }

    @Test public void
    create_new_follow_relationship() {
        repository.createRelationship("Alice", "Bob");
        assertThat(repository.getRelationships(), hasKey(String.valueOf("Alice")));
        assertThat(repository.getRelationships(), hasValue(contains(String.valueOf("Bob"))));
    }
    
    @Test public void
    edit_existing_relationship() {
        repository.createRelationship("Alice", "Bob");
        repository.createRelationship("Alice", "Toby");
        assertThat(repository.getRelationships(), hasKey(String.valueOf("Alice")));
        assertThat(repository.getRelationships(), hasValue(contains(String.valueOf("Bob"),String.valueOf( "Toby"))));
    }
}