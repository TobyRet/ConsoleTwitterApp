//package com.codurance.unittests;
//
//import com.codurance.Console;
//import com.codurance.PostFormatter;
//import com.codurance.ReadAction;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Matchers;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.Mockito.*;
//
//public class ReadActionShould {
//
//    private static final String INVALID_REQUEST = "Alice -> I like beer";
//    private static final String VALID_REQUEST = "Alice";
//    private ReadAction readAction;
//    private Console console;
//
//    @Before
//    public void initialise() {
//        console = mock(Console.class);
//        readAction = new ReadAction(console);
//    }
//
//    @Test public void
//    not_execute_if_command_is_invalid() {
//        readAction.execute(INVALID_REQUEST, this);
//
//        verify(postFormatter, never()).getFormmattedPostsFor(any());
//    }
//
//    @Test public void
//    send_users_posts_to_console_for_printing() {
//        List<String> alicePosts = new ArrayList();
//        alicePosts.add("Alice - I like beer (2 minutes ago)");
//        alicePosts.add("Alice - I like pancakes (3 minutes ago)");
//
//        when(postFormatter.getFormmattedPostsFor(Matchers.eq("Alice"))).thenReturn(alicePosts);
//
//        readAction.execute(VALID_REQUEST, this);
//
//        verify(console).print("Alice - I like beer (2 minutes ago)");
//        verify(console).print("Alice - I like pancakes (3 minutes ago)");
//    }
//}
