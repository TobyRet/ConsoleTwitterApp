//package com.codurance.unittests;
//
//import com.codurance.Clock;
//import com.codurance.Post;
//import com.codurance.PostFormatter;
//import com.codurance.Repository;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.runners.MockitoJUnitRunner;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.hamcrest.CoreMatchers.any;
//import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.assertThat;
//import static org.mockito.BDDMockito.given;
//
//@RunWith(MockitoJUnitRunner.class)
//public class PostFormatterShould {
//
//    private PostFormatter postFormatter;
//    @Mock Clock clock;
//    @Mock Repository repository;
//    private Post alicePost1;
//    private Post alicePost2;
//    private Post bobPost1;
//    private Post bobPost2;
//
//    @Before
//    public void initialise() {
//        postFormatter = new PostFormatter(repository);
//        alicePost1 = new Post("Alice", "I like beer", null);
//        alicePost2 = new Post("Alice", "I really really like beer", null);
//        given(clock.getTimeDifference().willReturn("3");
//        //given(clock.getTimeDifference(alicePost2.getDateTimeStamp())).willReturn("4");
//    }
//
//    @Test public void
//    format_a_post_ready_for_printing() {
//
//        List<Post> alicePosts = new ArrayList();
//        alicePosts.add(alicePost1);
//        alicePosts.add(alicePost2);
//
//        given(repository.getPostsFor("Alice")).willReturn(alicePosts);
//
//        assertThat(postFormatter.getFormmattedPostsFor("Alice").get(0), is("Alice - I like beer (3 minutes ago)"));
//        assertThat(postFormatter.getFormmattedPostsFor("Alice").get(1), is("Alice - I really really like beer (4 minutes ago)"));
//    }
//
////    @Test public void
////    format_wall_posts_ready_for_printing() {
////
////        List<Post> aliceWallPosts = new ArrayList();
////        bobPost1 = new Post("Bob", "I like cake", new Clock());
////        bobPost2 = new Post("Bob", "I really really like cake", new Clock());
////
//////        given(dateTime3.getTimeDifference(bobPost1.getDateTimeStamp())).willReturn("3");
//////        given(dateTime4.getTimeDifference(bobPost2.getDateTimeStamp())).willReturn("4");
////
////        aliceWallPosts.add(alicePost1);
////        aliceWallPosts.add(alicePost2);
////        aliceWallPosts.add(bobPost1);
////        aliceWallPosts.add(bobPost1);
////
////        given(repository.getWallPostsFor("Alice")).willReturn(aliceWallPosts);
////
////        assertThat(postFormatter.getWallPostsFor("Alice").get(0), is("Alice - I like beer (3 minutes ago)"));
////        assertThat(postFormatter.getWallPostsFor("Alice").get(1), is("Bob - I like cake (3 minutes ago)"));
////        assertThat(postFormatter.getWallPostsFor("Alice").get(3), is("Alice - I really really like beer (4 minutes ago)"));
////        assertThat(postFormatter.getWallPostsFor("Alice").get(4), is("Bob - I really really like cake (4 minutes ago)"));
////    }
//}
