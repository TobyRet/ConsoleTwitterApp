package com.codurance.unittests;

import com.codurance.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PostActionShould {

    private static final String VALID_REQUEST = "Alice -> Does anyone like beer?";
    private static final String INVALID_REQUEST = "Alice";
    private PostAction postAction;
    @Mock Repository repository;
    private PostDisplay postDisplay = new PostDisplay(new Clock());

    @Before
    public void initialise() {
        postAction = new PostAction();
    }

    @Test
    public void
    not_execute_if_command_is_not_valid() {
        postAction.execute(INVALID_REQUEST, postDisplay, repository);
        verify(repository, never()).add(any());
    }

    @Test
    public void
    add_post_to_user_account() {
        postAction.execute(VALID_REQUEST, postDisplay, repository);
        verify(repository).add(Matchers.any(Post.class));
    }
}
