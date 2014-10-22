package com.codurance.unittests;

import com.codurance.Console;
import com.codurance.PostFormatter;
import com.codurance.WallAction;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class WallActionShould {

    private static String INVALID_INPUT = "Alice follows Bob";
    private static String VALID_REQUEST = "Alice wall";
    private WallAction wallAction;
    private Console console;
    private PostFormatter postFormatter;

    @Before
    public void initialise() {
        console = mock(Console.class);
        postFormatter = mock(PostFormatter.class);
        wallAction  = new WallAction(postFormatter, console);
    }

    @Test public void
    not_execute_of_command_is_invalid() {
        wallAction.execute(INVALID_INPUT);
        verify(postFormatter, never()).getWallPostsFor(any());
    }

    @Test public void
    send_users_wall_posts_to_console_for_printing() {
        List<String> aliceWallPosts = new ArrayList();
        aliceWallPosts.add("Alice - I like beer (2 minutes ago)");
        aliceWallPosts.add("Alice - I like pancakes (3 minutes ago)");
        aliceWallPosts.add("Bob - I like beer and pancakes (4 minutes ago)");

        when(postFormatter.getWallPostsFor(any())).thenReturn(aliceWallPosts);

        wallAction.execute(VALID_REQUEST);

        verify(console).print("Alice - I like beer (2 minutes ago)");
        verify(console).print("Alice - I like pancakes (3 minutes ago)");
        verify(console).print("Bob - I like beer and pancakes (4 minutes ago)");
    }
}
