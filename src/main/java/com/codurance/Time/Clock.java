package com.codurance.Time;

import java.time.LocalDateTime;

public class Clock {

    private final LocalDateTime localDateTime;

    public Clock(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
