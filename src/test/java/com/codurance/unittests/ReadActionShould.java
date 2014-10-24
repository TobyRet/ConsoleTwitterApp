package com.codurance.unittests;

import com.codurance.*;
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
    @Mock PostDisplay postDisplay;
    private Repository repository;
    //@Mock Repository repository;

    @Before
    public void initialise() {
        readAction = new ReadAction();
        repository = new Repository();
    }

    @Test public void
    not_execute_if_command_is_invalid() {
        readAction.execute(INVALID_REQUEST, postDisplay, repository);

        verify(postDisplay, never()).print(any());
    }

    @Test public void
    retrieve_users_posts_and_send_for_printing() {
        PostAction postAction = new PostAction();
        postAction.execute("Alice -> I like beer", postDisplay, repository);
        postAction.execute("Alice -> I like lots of beer", postDisplay, repository);
        readAction.execute(VALID_REQUEST, postDisplay, repository);

        verify(postDisplay).print(Matchers.anyListOf(Post.class));
    }
}
