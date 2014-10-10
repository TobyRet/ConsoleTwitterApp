package com.codurance.unittests;

import com.codurance.Console;
import com.codurance.Twitter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ConsoleShould {

    @Mock
    Twitter twitter;

    @Test public void
    collect_user_input_and_pass_to_Twitter() {
        String post = "Alice -> Does anyone like beer?";
        Console console = new Console(twitter);
        console.storeInput(post);
        verify(twitter).handleUserRequest(post);
    }
}
