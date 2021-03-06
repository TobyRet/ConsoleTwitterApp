package com.codurance.unittests.actions;

import com.codurance.Actions.FollowAction;
import com.codurance.Posts.PostDisplay;
import com.codurance.Repository;
import com.codurance.Time.TimeFormatter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FollowActionShould {

    private static final String INVALID_INPUT = "Alice";
    private static final String VALID_INPUT = "Alice follows Bob";
    private FollowAction followAction;
    @Mock Repository repository;
    private PostDisplay postDisplay = new PostDisplay(new TimeFormatter());

    @Before
    public void initialise() {
        followAction = new FollowAction();
    }

    @Test public void
    not_execute_console_command_is_not_valid() {

        followAction.execute(INVALID_INPUT, postDisplay, repository);
        verify(repository, never()).createRelationship("Alice", "Bob");
    }

    @Test public void
    allow_a_user_to_follow_another_user() {
        followAction.execute(VALID_INPUT, postDisplay, repository);
        verify(repository).createRelationship("Alice", "Bob");
    }
}
