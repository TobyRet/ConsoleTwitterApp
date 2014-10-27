package com.codurance.unittests;

import com.codurance.Clock;
import com.codurance.Console;
import com.codurance.Post;
import com.codurance.PostDisplay;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PostDisplayShould {

    @Mock Console console;
    @Mock Clock mockedClock;

    @Test public void
    format_posts_for_printing() {
        PostDisplay postDisplay = new PostDisplay(mockedClock);

        Post post_1 = new Post("Alice", "I like beer", new Clock());
        Post post_2 = new Post("Alice", "I like cake", new Clock());

        given(mockedClock.getTimeDifference(post_1.getDateTimeStamp())).willReturn("3");
        given(mockedClock.getTimeDifference(post_2.getDateTimeStamp())).willReturn("4");

        List<Post> alicePosts = new ArrayList();
        alicePosts.add(post_1);
        alicePosts.add(post_2);

        postDisplay.displayAll(alicePosts, console);
        verify(console).print("Alice - I like beer (3 minutes ago)");
        verify(console).print("Alice - I like cake (4 minutes ago)");
    }
}
