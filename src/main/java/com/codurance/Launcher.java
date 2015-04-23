package com.codurance;

import java.io.IOException;
import com.codurance.Actions.ActionList;
import com.codurance.Actions.FollowAction;
import com.codurance.Actions.PostAction;
import com.codurance.Actions.ReadAction;
import com.codurance.Actions.WallAction;

public class Launcher {
    private static Console console = new Console();
    private static PostAction postAction = new PostAction();
    private static WallAction wallAction = new WallAction();
    private static ReadAction readAction = new ReadAction();
    private static FollowAction followAction = new FollowAction();

    public static void main(String[] args) throws IOException {
        ActionList actionList = new ActionList(wallAction, readAction, followAction, postAction);
        Twitter twitter = new Twitter(actionList, console);
        System.out.println("Welcome to Twitter");

        while(true) {
            twitter.getConsoleInput();
        }

    }
}
