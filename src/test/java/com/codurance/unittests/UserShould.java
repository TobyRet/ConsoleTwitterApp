package com.codurance.unittests;

import com.codurance.Post;
import com.codurance.User;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class UserShould {

    private static final Post POST_1 = new Post("Hi there");
    private static final Post POST_2 = new Post("How are you?");
    private User alice;

    @Test public void
    store_post_in_collection() {
        User alice = createUserAndPosts();
        assertThat(alice.getAllPosts().size(), is(2));
    }


    @Test public void
    create_and_store_time_stamp_alongside_post() {
        //DateTimeStamp dateTimeStamp = mock(DateTimeStamp.class);
        User alice = new User("Alice");
        //when(dateTimeStamp.create()).thenReturn(new Date());
        Post post = new Post("Hi there");
        alice.addPost(post);

        assertThat(alice.getAllPosts().get(0), hasProperty("Post", isA(Post.class)));

        System.out.println(alice.getAllPosts());
        System.out.println(alice.getAllPosts().get(0));

    }

    private User createUserAndPosts() {
        alice = new User("Alice");
        alice.addPost(POST_1);
        alice.addPost(POST_2);
        return alice;
    }
}
