package com.codurance.unittests;

import com.codurance.Clock;
import com.codurance.Console;
import com.codurance.Post;
import com.codurance.PostDisplay;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PostDisplayShould {

    @Mock Console console;
    @Mock Clock mockedClock;

    @Test public void
    format_posts_for_printing() {
        PostDisplay postDisplay = new PostDisplay(new Clock(LocalDateTime.of(2014, 10, 10, 10, 18, 00)));

        Post post_1 = new Post("Alice", "I like beer", new Clock(LocalDateTime.of(2014, 10, 10, 10, 12, 00)));
        Post post_2 = new Post("Alice", "I like cake", new Clock(LocalDateTime.of(2014, 10, 10, 10, 14, 00)));
        Post post_3 = new Post("Alice", "I want more beer", new Clock(LocalDateTime.of(2014, 10, 10, 10, 16, 00)));

        List<Post> alicePosts = new ArrayList();
        alicePosts.add(post_1);
        alicePosts.add(post_2);
        alicePosts.add(post_3);

        postDisplay.displayAll(alicePosts, console);
        verify(console).print("Alice - I like beer (6 minutes ago)");
        verify(console).print("Alice - I like cake (4 minutes ago)");
        verify(console).print("Alice - I want more beer (2 minutes ago)");
    }
}
