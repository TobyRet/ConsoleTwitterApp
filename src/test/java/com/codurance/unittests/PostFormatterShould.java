package com.codurance.unittests;

import com.codurance.DateTimeStamp;
import com.codurance.Post;
import com.codurance.PostFormatter;
import com.codurance.Repository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class PostFormatterShould {

    private Repository repository;
    private PostFormatter postFormatter;
    @Mock DateTimeStamp dateTime1;
    @Mock DateTimeStamp dateTime2;

    @Before
    public void initialise() {
        repository = new Repository();
        postFormatter = new PostFormatter(repository);
    }

    @Test public void
    format_a_post_ready_for_printing() {
        Post post1 = new Post("Alice", "I like beer", dateTime1);
        Post post2 = new Post("Alice", "I like really really like beer", dateTime2);

        given(dateTime1.getTimeDifference()).willReturn("3");
        given(dateTime2.getTimeDifference()).willReturn("4");

        repository.add(post1);
        repository.add(post2);

        assertThat(postFormatter.getPostsFor("Alice").get(0), is("Alice - I like beer (3 minutes ago)"));
        assertThat(postFormatter.getPostsFor("Alice").get(1), is("Alice - I like beer (4 minutes ago)"));
    }
}
