package com.codurance.unittests;

import com.codurance.Post;
import com.codurance.Repository;
import com.codurance.User;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PostShould {

    private String userInput;
    private Post post;
    private Repository repository;

    @Before public void
    initialise() {
        userInput = "Alice -> Does anyone like beer?";
        repository = mock(Repository.class);
        post = new Post(repository);
    }

    @Test public void
    determine_user_name_from_console_input() {
        assertThat(post.extractNameFromInput(userInput), is("Alice"));
    }

    @Test public void
    determine_user_post_from_console_input() {
        assertThat(post.extractPostFromInput(userInput), is("Does anyone like beer?"));
    }

    @Test public void
    get_user_from_repository() {
        post.getOrCreateUser(userInput);
        User alice = mock(User.class);
        when(repository.findOrCreate("Alice")).thenReturn(alice);
        verify(repository).findOrCreate("Alice");
    }

    @Test public void
    add_post_to_user_account() {
        
    }
}
