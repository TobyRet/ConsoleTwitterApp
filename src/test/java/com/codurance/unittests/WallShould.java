package com.codurance.unittests;

import com.codurance.Console;
import com.codurance.Repository;
import com.codurance.Wall;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class WallShould {

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
    should_not_execute_if_command_s_not_valid() {

    }
}
