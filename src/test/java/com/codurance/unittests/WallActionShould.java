package com.codurance.unittests;

import com.codurance.Console;
import com.codurance.Repository;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class WallActionShould {

    private static final String INVALID_REQUEST = "Alice -> I like beer";
    private static final String VALID_REQUEST = "Alice";
    private Repository repository;
    private WallAction wallAction;
    private Console console;

    @Before
    public void initialise() {
        repository = mock(Repository.class);
        console = mock(Console.class);
        wallAction = new WallAction(repository, console);
    }

    @Test public void
    not_execute_if_command_is_invalid() {
        wallAction.execute(INVALID_REQUEST);

        verify(repository, never()).getPostsFor(any());
    }

    @Test public void
    send_users_posts_to_console_for_printing() {
        wallAction.execute(VALID_REQUEST);
        verify(console).print(any());
    }
}
