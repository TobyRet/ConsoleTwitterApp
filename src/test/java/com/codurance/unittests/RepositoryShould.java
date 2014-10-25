package com.codurance.unittests;

import com.codurance.Clock;
import com.codurance.Post;
import com.codurance.Repository;
import org.junit.Before;
import org.junit.Test;

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
        Post alicePost1 = new Post("Alice", "Blah", new Clock());
        Post alicePost2 = new Post("Alice", "Blah", new Clock());
        Post ottoPost = new Post("Otto", "Blah", new Clock());

        repository.add(alicePost1);
        repository.add(alicePost2);
        repository.add(ottoPost);

        assertThat(repository.getPostsFor("Alice").size(), is(2));
        assertThat(repository.getPostsFor("Alice").get(0).getUser(), is("Alice"));
        assertThat(repository.getPostsFor("Alice").get(1).getUser(), is("Alice"));
    }

//    @Test public void
//    create_new_follow_relationship() {
//        repository.createRelationship("Alice", "Bob");
//        assertThat(repository.getRelationships(), hasKey(String.valueOf("Alice")));
//        assertThat(repository.getRelationships(), hasValue(contains(String.valueOf("Bob"))));
//    }
//
//    @Test public void
//    edit_existing_relationship() {
//        repository.createRelationship("Alice", "Bob");
//        repository.createRelationship("Alice", "Toby");
//        assertThat(repository.getRelationships(), hasKey(String.valueOf("Alice")));
//        assertThat(repository.getRelationships(), hasValue(contains(String.valueOf("Bob"),String.valueOf( "Toby"))));
//    }
}