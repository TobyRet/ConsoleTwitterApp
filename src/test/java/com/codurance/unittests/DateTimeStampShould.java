package com.codurance.unittests;

import com.codurance.DateTimeStamp;
import org.junit.Test;

import static java.time.LocalDateTime.of;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DateTimeStampShould {

    @Test public void
    return_a_new_date_time_stamp() {
        DateTimeStamp dts = new DateTimeStamp(of(2014, 10, 19, 8, 30));
        assertThat(dts.getLocalDateTime(), is("2014-10-19T08:30"));
    }
}
