package com.codurance.unittests.actions;

import com.codurance.Actions.ActionList;
import com.codurance.Actions.FollowAction;
import com.codurance.Actions.PostAction;
import com.codurance.Actions.ReadAction;
import com.codurance.Actions.WallAction;
import com.codurance.Posts.PostDisplay;
import com.codurance.Repository;
import com.codurance.Time.TimeFormatter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ActionListShould {

    @Mock WallAction wallAction;
    @Mock ReadAction readAction;
    @Mock FollowAction followAction;
    @Mock PostAction postAction;
    private PostDisplay postDisplay = new PostDisplay(new TimeFormatter());
    private Repository repository = new Repository();

    @Test public void
    iterate_through_list_and_call_execute_on_each_action() {
        ActionList actionList = new ActionList(wallAction, readAction, followAction, postAction);
        String userInput = "Alice -> I like cake";
        actionList.execute(userInput, postDisplay, repository);

        verify(wallAction).execute(userInput, postDisplay, repository);
        verify(readAction).execute(userInput, postDisplay, repository);
        verify(postAction).execute(userInput, postDisplay, repository);
        verify(followAction).execute(userInput, postDisplay, repository);
    }
}
