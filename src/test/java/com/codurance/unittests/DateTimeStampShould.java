package com.codurance.unittests;

import com.codurance.DateTimeStamp;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.of;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DateTimeStampShould {

    private DateTimeStamp dts;

    @Before
    public void initialise() {
        dts = new DateTimeStamp(of(2014, 10, 19, 8, 30));
    }

    @Test public void
    return_a_new_date_time_stamp() {
        assertThat(dts.getLocalDateTime(), is(LocalDateTime.parse("2014-10-19T08:30")));
    }
}
