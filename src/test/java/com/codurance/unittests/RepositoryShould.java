package com.codurance.unittests;

import com.codurance.Post;
import com.codurance.Repository;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class RepositoryShould {

    @Test public void
    add_post_to_list() {
        Post post = mock(Post.class);
        Repository repository = new Repository();

        repository.add(post);

        assertThat(repository.getPosts().size(), is(1));
    }
}
