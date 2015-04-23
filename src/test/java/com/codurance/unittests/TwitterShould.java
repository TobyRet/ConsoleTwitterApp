package com.codurance.unittests;

import java.io.IOException;
import com.codurance.Actions.ActionList;
import com.codurance.Actions.FollowAction;
import com.codurance.Actions.PostAction;
import com.codurance.Actions.ReadAction;
import com.codurance.Actions.WallAction;
import com.codurance.Console;
import com.codurance.Twitter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TwitterShould {

    @Mock Console console;
    @Mock ReadAction readAction;
    @Mock WallAction wallAction;
    @Mock PostAction postAction;
    @Mock FollowAction followAction;
    @Mock ActionList actionList;

    @Test public void
    read_user_input_from_console_and_direct_request() throws IOException {
        Twitter twitter = new Twitter(actionList, console);
        String userCommand = "Alice -> does anyone like beer?";

        given(console.getUserCommand()).willReturn(userCommand);

        twitter.getConsoleInput();
        verify(actionList).execute(any(), any(), any());
    }
}

