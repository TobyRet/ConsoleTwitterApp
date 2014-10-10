package com.codurance.unittests;

import com.codurance.Post;
import com.codurance.Repository;
import com.codurance.User;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

public class PostShould {

    private String userInput;
    private Post post;
    @Mock Repository repositoryInterface;

    @Before public void
    initialise() {
        userInput = "Alice -> Does anyone like beer?";
        post = new Post();
    }

    @Test public void
    determine_user_name_from_console_input() {
        assertThat(post.execute(userInput), is("Alice"));
    }

    @Ignore
    @Test public void
    create_new_user_if_she_does_not_exist() {
        post.checkIfValidRequest(userInput);
        User alice = new User("Alice");
        when(repositoryInterface.findOrCreate("Alice")).thenReturn(alice);
    }
}
