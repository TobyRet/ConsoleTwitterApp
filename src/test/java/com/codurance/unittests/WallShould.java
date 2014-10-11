package com.codurance.unittests;

import com.codurance.Console;
import com.codurance.Repository;
import com.codurance.User;
import com.codurance.Wall;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

public class WallShould {

    private Wall wall;
    private Repository repository;
    private String userInput1;
    private String userInput2;
    private Console console;

    @Before
    public void initialise() {
        repository = mock(Repository.class);
        console = mock(Console.class);
        wall = new Wall(repository, console);
        userInput1 = "Alice";
        userInput2 = "Alice -> Hey there";
    }

    @Test public void
    process_if_command_is_valid() {
        // ask Sandro about testing private methods
        assertThat(wall.parseCommand(userInput1),is(true));
        assertThat(wall.parseCommand(userInput2),is(false));
    }

    @Test public void
    retrieve_users_posts_and_send_to_console() {
        User alice = mock(User.class);
        List<String> posts = new ArrayList();
        posts.add("Does anyone like beer?");

        when(repository.findOrCreate(userInput1)).thenReturn(alice);
        when(alice.getPosts()).thenReturn(posts);

        wall.checkIfValidRequest(userInput1);
        verify(console).print(posts);
    }
}
