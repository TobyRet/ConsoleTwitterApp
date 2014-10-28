package com.codurance.unittests;

import com.codurance.Clock;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class clockShould {

    private LocalDateTime POST_CREATED_AT = LocalDateTime.of(2014, 10, 10, 10, 10, 00);

    @Test public void
    display_time_difference_in_seconds_if_under_a_minute_other_wise_display_in_minutes() {
        Clock clock1 = new Clock(LocalDateTime.of(2014, 10, 10, 10, 10, 10));
        assertThat(clock1.getTimeDifference(POST_CREATED_AT), is ("10 seconds ago"));

        Clock clock2 = new Clock(LocalDateTime.of(2014, 10, 10, 10, 11, 00));
        assertThat(clock2.getTimeDifference(POST_CREATED_AT), is ("1 minute ago"));

        Clock clock3 = new Clock(LocalDateTime.of(2014, 10, 10, 10, 12, 00));
        assertThat(clock3.getTimeDifference(POST_CREATED_AT), is ("2 minutes ago"));

    }
}
