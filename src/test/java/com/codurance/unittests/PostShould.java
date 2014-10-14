package com.codurance.unittests;

import com.codurance.PostAction;
import com.codurance.Repository;
import com.codurance.User;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class PostShould {

    private static final String VALID_REQUEST = "Alice -> Does anyone like beer?";
    private static final String INVALID_REQUEST = "Alice";
    private PostAction postAction;
    private Repository repository;
    private User alice;

    @Before
    public void
    initialise() {
        repository = mock(Repository.class);
        postAction = new PostAction(repository);
    }

    @Test
    public void
    do_not_execute_if_command_is_not_valid() {
        postAction.execute(INVALID_REQUEST);
        verify(repository, never()).findOrCreate(any());
    }

    @Test
    public void
    add_post_to_user_account() {
        alice = mock(User.class);
        when(repository.findOrCreate("Alice")).thenReturn(alice);
        postAction.execute(VALID_REQUEST);
        verify(alice).addPost(any());
    }
}
