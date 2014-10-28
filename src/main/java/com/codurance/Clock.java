package com.codurance;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Clock {

    private final LocalDateTime localDateTime;

    public Clock(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public String getTimeDifference(LocalDateTime postDateTime) {
        long difference = LocalDateTime.from(postDateTime).until(getLocalDateTime(), ChronoUnit.SECONDS);

        String formattedTimeDifference = "";

        if((int) difference < 60) {
            formattedTimeDifference = String.valueOf(difference) + " seconds ago";
        }

        if((int) difference == 60) {
            formattedTimeDifference = String.valueOf(difference / 60) + " minute ago";
        }

        if((int) difference > 60) {
            formattedTimeDifference = String.valueOf(difference / 60) + " minutes ago";
        }

        return formattedTimeDifference;
    }
}
