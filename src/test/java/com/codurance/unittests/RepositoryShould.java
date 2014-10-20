package com.codurance.unittests;

import com.codurance.DateTimeStamp;
import com.codurance.Post;
import com.codurance.Repository;
import org.junit.Test;

import static java.time.LocalDateTime.now;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RepositoryShould {

    @Test public void
    return_a_users_posts() {
        Post alicePost = new Post("Alice", "Blah", new DateTimeStamp(now()));
        Post fredPost = new Post("Fred", "Blah", new DateTimeStamp(now()));
        Post ottoPost = new Post("Otto", "Blah", new DateTimeStamp(now()));

        Repository repository = new Repository();
        repository.add(alicePost);
        repository.add(fredPost);
        repository.add(ottoPost);

        assertThat(repository.getPostsFor("Alice").size(), is(1));
    }
}
