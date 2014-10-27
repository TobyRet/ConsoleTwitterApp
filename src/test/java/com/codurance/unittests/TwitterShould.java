package com.codurance.unittests;

import com.codurance.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TwitterShould {

    @Mock Actions actions;
    @Mock Console console;

    @Test public void
    read_user_input_from_console_and_direct_request() {
        Twitter twitter = new Twitter(actions, console);
        String userCommand = "Alice -> does anyone like beer?";

        given(console.getUserCommand()).willReturn(userCommand);

        twitter.handleUserRequest(console.getUserCommand());
        verify(actions).execute(Matchers.any(String.class), Matchers.any(PostDisplay.class), Matchers.any(Repository.class));
    }
}
