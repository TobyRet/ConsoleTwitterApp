//package com.codurance;
//
//import java.time.LocalDateTime;
//import java.time.temporal.ChronoUnit;
//
//public class Clock {
//    private LocalDateTime ldt;
//
//    public LocalDateTime getLocalDateTime() {
//        return ldt = LocalDateTime.now();
//    }
//
//    public String getTimeDifference(LocalDateTime postDateTime) {
//        long difference = LocalDateTime.from(postDateTime).until(LocalDateTime.now(), ChronoUnit.MINUTES);
//        return String.valueOf(difference);
//    }
//}
