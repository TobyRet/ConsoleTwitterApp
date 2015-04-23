package com.codurance.unittests.actions;

import com.codurance.Actions.PostAction;
import com.codurance.Actions.ReadAction;
import com.codurance.Posts.Post;
import com.codurance.Posts.PostDisplay;
import com.codurance.Repository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ReadActionShould {

    private static final String INVALID_REQUEST = "Alice -> I like beer";
    private static final String VALID_REQUEST = "Alice";
    private ReadAction readAction;
    @Mock
    PostDisplay postDisplay;
    private Repository repository;

    @Before
    public void initialise() {
        readAction = new ReadAction();
        repository = new Repository();
    }

    @Test public void
    not_execute_if_command_is_invalid() {
        readAction.execute(INVALID_REQUEST, postDisplay, repository);

        verify(postDisplay, never()).displayAll(any(), any());
    }

    @Test public void
    retrieve_users_posts_and_send_for_printing() {
        PostAction postAction = new PostAction();
        postAction.execute("Alice -> I like beer", postDisplay, repository);
        postAction.execute("Alice -> I like lots of beer", postDisplay, repository);
        readAction.execute(VALID_REQUEST, postDisplay, repository);

        verify(postDisplay).displayAll(Matchers.anyListOf(Post.class), any());
    }
}
