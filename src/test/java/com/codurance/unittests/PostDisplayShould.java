package com.codurance.unittests;

import com.codurance.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyVararg;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PostDisplayShould {

    @Mock Console console;
    @Mock TimeFormatter timeFormatter;

    @Test public void
    format_posts_for_printing() {
        PostDisplay postDisplay = new PostDisplay(timeFormatter);

        Post post_1 = new Post("Alice", "I like beer", new Clock(LocalDateTime.of(2014, 10, 10, 10, 17, 50)));
        Post post_2 = new Post("Alice", "I like cake", new Clock(LocalDateTime.of(2014, 10, 10, 10, 17, 00)));
        Post post_3 = new Post("Alice", "I want more beer", new Clock(LocalDateTime.of(2014, 10, 10, 10, 16, 00)));

        List<Post> alicePosts = new ArrayList();
        alicePosts.add(post_1);
        alicePosts.add(post_2);
        alicePosts.add(post_3);

        when(timeFormatter.getTimeDifference(anyVararg(), anyVararg())).thenReturn("10 seconds ago", "1 minute ago", "2 minutes ago");

        postDisplay.displayAll(alicePosts, console);
        verify(console).print("Alice - I like beer (10 seconds ago)");
        verify(console).print("Alice - I like cake (1 minute ago)");
        verify(console).print("Alice - I want more beer (2 minutes ago)");
    }
}
