package com.codurance.unittests;

import com.codurance.Time.Clock;
import com.codurance.Posts.Post;
import com.codurance.Repository;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
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
    return_a_users_posts() throws InterruptedException {
        createDummyPosts();

        assertThat(repository.getPostsFor("Alice").size(), is(2));
        assertThat(repository.getPostsFor("Alice").get(0).getUser(), is("Alice"));
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

    @Test public void
    retrieve_a_users_wall_posts() throws InterruptedException {
        createDummyPosts();

        repository.createRelationship("Alice", "Toby");

        assertThat(repository.getWallPostsFor("Alice").size(), is(3));
        assertThat(repository.getWallPostsFor("Alice").get(0).getMessage(), is("Another Alice message"));
        assertThat(repository.getWallPostsFor("Alice").get(1).getMessage(), is("Toby message"));
    }

    private void createDummyPosts() throws InterruptedException {
        Post alicePost1 = new Post("Alice", "Alice message", new Clock(LocalDateTime.now()));
        Thread.sleep(1);
        Post tobyPost = new Post("Toby", "Toby message", new Clock(LocalDateTime.now()));
        Thread.sleep(1);
        Post alicePost2 = new Post("Alice", "Another Alice message", new Clock(LocalDateTime.now()));

        repository.add(alicePost1);
        repository.add(alicePost2);
        repository.add(tobyPost);
    }
}
