package com.codurance.unittests;

import com.codurance.Clock;
import com.codurance.TimeFormatter;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TimeFormatterShould {

    private static final LocalDateTime POST_CREATED_AT = new Clock(LocalDateTime.of(2014, 10, 10, 10, 10, 00)).getLocalDateTime();
    private LocalDateTime timeNow;

    @Test public void
    display_time_difference_in_seconds_if_under_a_minute_other_wise_display_in_minutes() {

        TimeFormatter timeFormatter = new TimeFormatter();

        timeNow = new Clock(LocalDateTime.of(2014, 10, 10, 10, 10, 10)).getLocalDateTime();
        assertThat(timeFormatter.getTimeDifference(POST_CREATED_AT, timeNow), is ("10 seconds ago"));

        timeNow = new Clock(LocalDateTime.of(2014, 10, 10, 10, 11, 00)).getLocalDateTime();
        assertThat(timeFormatter.getTimeDifference(POST_CREATED_AT, timeNow), is ("1 minute ago"));

        timeNow = new Clock(LocalDateTime.of(2014, 10, 10, 10, 12, 00)).getLocalDateTime();
        assertThat(timeFormatter.getTimeDifference(POST_CREATED_AT, timeNow), is ("2 minutes ago"));
    }
}
