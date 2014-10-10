package com.codurance.unittests;

import com.codurance.Actions;
import com.codurance.Twitter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TwitterShould {

    @Mock Actions actions;

    @Test public void
    read_user_input_from_console_and_direct_request() {
        Twitter twitter = new Twitter(actions);
        String userInput = "Alice -> does anyone like beer?";
        twitter.handleUserRequest(userInput);
        verify(actions).checkIfValidRequest(userInput);
    }
}
