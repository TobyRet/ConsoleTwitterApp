package com.codurance.unittests;

import com.codurance.FollowAction;
import com.codurance.Repository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FollowActionShould {

    private static final String INVALID_INPUT = "Alice";
    private static final String VALID_INPUT = "Alice follow Bob";
    @Mock Repository repository;

    @Test public void
    not_execute_console_command_is_not_valid() {
        FollowAction followAction = new FollowAction(repository);
        followAction.execute(INVALID_INPUT);
        verify(repository, never()).follow(any());
    }
}
