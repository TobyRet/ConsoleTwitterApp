package com.codurance.unittests;

import com.codurance.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class WallActionShould {

    private static final Post POST_1 = mock(Post.class);
    private static final Post POST_2 = mock(Post.class);
    private WallAction wall;
    private Repository repository;
    private String VALID_INPUT = "Alice";
    private String INVALID_INPUT = "Alice -> Hey there";

    private Console console;

    @Before
    public void initialise() {
        repository = mock(Repository.class);
        console = mock(Console.class);
        wall = new WallAction(repository, console);
    }

    @Test public void
    not_execute_if_command_is_not_valid() {
        wall.execute(INVALID_INPUT);
        verify(console, never()).print(any());
    }

    @Test public void
    instruct_console_to_print_display_the_users_posts() {
        User alice = mock(User.class);
        when(repository.findOrCreate(any())).thenReturn(alice);

        List<Object> alicePosts = new ArrayList<>();
//        alicePosts.add(POST_1);
//        alicePosts.add(POST_2);
        when(alice.getAllPosts()).thenReturn(alicePosts);

        wall.execute(VALID_INPUT);
        verify(console).print(alicePosts);
    }
}
