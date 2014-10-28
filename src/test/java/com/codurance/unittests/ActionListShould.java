package com.codurance.unittests;

import com.codurance.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDateTime;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ActionListShould {

    @Mock WallAction wallAction;
    @Mock ReadAction readAction;
    @Mock FollowAction followAction;
    @Mock PostAction postAction;
    private String userInput = "Alice -> I like cake";
    private Clock clock = new Clock(LocalDateTime.now());
    private PostDisplay postDisplay = new PostDisplay(clock);
    private Repository repository = new Repository();

    @Test public void
    iterate_through_list_and_call_execute_on_each_action() {
        ActionList actionList = new ActionList(wallAction, readAction, followAction, postAction);
        actionList.execute(userInput, postDisplay, repository);

        verify(wallAction).execute(userInput, postDisplay, repository);
        verify(readAction).execute(userInput, postDisplay, repository);
        verify(postAction).execute(userInput, postDisplay, repository);
        verify(followAction).execute(userInput, postDisplay, repository);
    }
}
