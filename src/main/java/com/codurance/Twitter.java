package com.codurance;

import java.io.IOException;
import java.time.LocalDateTime;

public class Twitter {
    private final Repository repository = new Repository();
    private final PostDisplay postDisplay = new PostDisplay(new Clock(LocalDateTime.now()));
    private final Console console;
    private ActionList actionList;

    public Twitter(ActionList actionList, Console console) {
        this.actionList = actionList;
        this.console = console;
    }

    public void getConsoleInput() throws IOException {
        handleUserRequest(console.getUserCommand());
    }

    private void handleUserRequest(String userCommand) throws IOException {
        actionList.execute(userCommand, postDisplay, repository);
    }
}
