package com.codurance.unittests;

import com.codurance.Console;
import com.codurance.Repository;
import com.codurance.User;
import com.codurance.Wall;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class WallShould {

    private static final String POST_1 = "I like beer";
    private static final String POST_2 = "I like it very much";
    private Wall wall;
    private Repository repository;
    private String VALID_INPUT = "Alice";
    private String INVALID_INPUT = "Alice -> Hey there";

    private Console console;

    @Before
    public void initialise() {
        repository = mock(Repository.class);
        console = mock(Console.class);
        wall = new Wall(repository, console);
    }

    @Test public void
    not_execute_if_command_is_not_valid() {
        wall.execute(INVALID_INPUT);
        verify(repository, never()).findOrCreate(any());
    }

    @Test public void
    execute_if_command_is_valid() {
        wall.execute(VALID_INPUT);
        verify(repository).findOrCreate(VALID_INPUT);
    }

    @Test public void
    instruct_console_to_print_display_the_users_posts() {
        User alice = mock(User.class);
        List<String> alicePosts = new ArrayList<>();

        alicePosts.add(POST_1);
        alicePosts.add(POST_2);

        wall.execute(VALID_INPUT);
        when(alice.getPosts()).thenReturn(alicePosts);

        verify(console).print(alicePosts);
    }
}
