//package com.codurance;
//
//import java.time.LocalDateTime;
//
//public class Post implements Comparable<Post> {
//    private final String message;
//    private final String user;
//    private LocalDateTime dateTime;
//
//    public Post(String user, String message, Clock dateTimeStamp) {
//        this.user = user;
//        this.message = message;
//        this.dateTime = dateTimeStamp.getLocalDateTime();
//    }
//
//    public String getUser() {
//        return user;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public LocalDateTime getDateTimeStamp() {
//        return dateTime;
//    }
//
//    @Override
//    public int compareTo(Post anotherPost) {
//        return this.dateTime.compareTo(anotherPost.dateTime);
//    }
//}
