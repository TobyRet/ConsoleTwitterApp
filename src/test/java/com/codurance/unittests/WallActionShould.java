package com.codurance.unittests;

import com.codurance.Repository;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class WallActionShould {

    private static final String INVALID_REQUEST = "Alice -> I like beer";

    @Test public void
    not_execute_if_command_is_invalid() {
        Repository repository = mock(Repository.class);
        WallAction wallAction = new WallAction(repository);

        wallAction.execute(INVALID_REQUEST);

        verify(repository, never()).getPosts();
    }
    
    @Test public void
    () {
        assertThat(, is());
    }
}
