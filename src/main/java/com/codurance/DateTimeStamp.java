package com.codurance;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeStamp {
    private final LocalDateTime ldt;

    public DateTimeStamp(LocalDateTime ldt) {
        this.ldt = ldt;
    }

    public LocalDateTime getLocalDateTime() {
        return ldt;
    }

    public String getTimeDifference() {
        long difference = LocalDateTime.from(ldt).until(LocalDateTime.now(), ChronoUnit.MINUTES);
        return String.valueOf(difference);
    }
}
