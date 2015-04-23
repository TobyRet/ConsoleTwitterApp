package com.codurance.Time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimeFormatter {

    public String getTimeDifference(LocalDateTime postDateTime, LocalDateTime timeNow) {
        long difference = LocalDateTime.from(postDateTime).until(timeNow, ChronoUnit.SECONDS);

        String formattedTimeDifference = formatTimeDifference(difference);

        return formattedTimeDifference;
    }

    private String formatTimeDifference(long difference) {
        String formattedTimeDifference = "";

        if(Math.round(difference) == 1) {
            formattedTimeDifference = String.valueOf(difference) + " second ago";
        }

        if(Math.round(difference) < 60) {
            formattedTimeDifference = String.valueOf(difference) + " seconds ago";
        }

        if((Math.round(difference) >= 60) && (Math.round(difference) < 120)) {
            formattedTimeDifference = String.valueOf(difference / 60) + " minute ago";
        }

        if(Math.round(difference) >= 120) {
            formattedTimeDifference = String.valueOf(difference / 60) + " minutes ago";
        }
        return formattedTimeDifference;
    }
}
