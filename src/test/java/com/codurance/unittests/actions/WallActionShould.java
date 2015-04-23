package com.codurance.unittests.actions;

import com.codurance.Posts.Post;
import com.codurance.Posts.PostDisplay;
import com.codurance.Repository;
import com.codurance.Actions.WallAction;
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
public class WallActionShould {

    private static String INVALID_INPUT = "Alice follows Bob";
    private static String VALID_REQUEST = "Alice wall";
    private WallAction wallAction;
    @Mock PostDisplay postDisplay;
    @Mock Repository repository;

    @Before
    public void initialise() {
        wallAction  = new WallAction();
    }

    @Test public void
    not_execute_if_command_is_invalid() {
        wallAction.execute(INVALID_INPUT, postDisplay, repository);
        verify(postDisplay, never()).displayAll(any(), any());
    }

    @Test public void
    send_users_wall_posts_to_PostDisplay_for_printing() {
        wallAction.execute(VALID_REQUEST, postDisplay, repository);
        verify(postDisplay).displayAll(Matchers.anyListOf(Post.class), any());
    }
}
