package com.codurance;

import static java.time.LocalDateTime.now;

public class PostAction implements Actions {

    private Repository repository;

    public PostAction(Repository repository) {
        this.repository = repository;
    }

    public void execute(String userInput) {
        if (userInput.contains("->")) {
            String dts = new DateTimeStamp(now()).getLocalDateTime();
            Post post = new Post(getUser(userInput), getMessage(userInput), dts);
            repository.add(post);
        }
    }

    private String createDateTimeStamp() {
        return new DateTimeStamp(now()).getLocalDateTime();
    }

    private String getMessage(String userInput) {
        return userInput.split("-> ")[1];
    }

    private String getUser(String userInput) {
        return userInput.split(" ")[0];
    }

}
