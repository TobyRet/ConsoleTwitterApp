//package com.codurance.unittests;
//
//import com.codurance.Clock;
//import com.codurance.Post;
//import com.codurance.PostAction;
//import com.codurance.Repository;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.ArgumentCaptor;
//
//import static org.hamcrest.CoreMatchers.instanceOf;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThat;
//import static org.mockito.Matchers.any;
//import static org.mockito.Mockito.*;
//
//public class PostActionShould {
//
//    private static final String VALID_REQUEST = "Alice -> Does anyone like beer?";
//    private static final String INVALID_REQUEST = "Alice";
//    private PostAction postAction;
//    private Repository repository;
//
//    @Before
//    public void
//    initialise() {
//        repository = mock(Repository.class);
//        postAction = new PostAction(repository);
//    }
//
//    @Test
//    public void
//    not_execute_if_command_is_not_valid() {
//        postAction.execute(INVALID_REQUEST, this);
//        verify(repository, never()).add(any());
//    }
//
//    @Test
//    public void
//    add_post_to_user_account() {
//        ArgumentCaptor<Post> argument = ArgumentCaptor.forClass(Post.class);
//
//        postAction.execute(VALID_REQUEST, this);
//
//        verify(repository).add(argument.capture());
//        assertThat(argument.getValue(), instanceOf(Post.class));
//        assertEquals("Alice", argument.getValue().getUser());
//        assertEquals("Does anyone like beer?", argument.getValue().getMessage());
//        assertThat(argument.getValue().getDateTimeStamp(), instanceOf(Clock.class));
//    }
//}
