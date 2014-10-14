package com.codurance.unittests;

import com.codurance.Post;
import com.codurance.User;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class UserShould {

    private static final Post POST_1 = new Post("Hi there");
    private static final Post POST_2 = new Post("How are you?");

    @Test public void
    store_post_in_collection() {
        User alice = new User("Alice");
        alice.addPost(POST_1);
        alice.addPost(POST_2);

        assertThat(alice.getPosts().size(), is(2));
    }
}
