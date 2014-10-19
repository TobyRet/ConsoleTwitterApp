package com.codurance;

import java.time.LocalDateTime;

public class DateTimeStamp {
    private final LocalDateTime ldt;

    public DateTimeStamp(LocalDateTime ldt) {
        this.ldt = ldt;
    }


    public String getLocalDateTime() {
        return ldt.toString();
    }
}
