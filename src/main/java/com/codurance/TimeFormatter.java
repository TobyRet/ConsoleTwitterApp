package com.codurance;

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
