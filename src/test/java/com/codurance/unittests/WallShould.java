package com.codurance.unittests;

import com.codurance.Repository;
import com.codurance.Wall;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WallShould {

    private Wall wall;
    private Repository repository;

    @Test public void
    process_if_command_is_valid() {
        String userInput1 = "Alice";
        String userInput2 = "Alice -> Hey there";

        wall = new Wall(repository);

        wall.checkIfValidRequest(userInput1);
        assertThat(wall.parseCommand(userInput1),is(true));

        wall.checkIfValidRequest(userInput2);
        assertThat(wall.parseCommand(userInput2),is(false));
    }
}
