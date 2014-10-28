package com.codurance;

import java.util.ArrayList;

public class ActionList implements Actions {

    private final WallAction wallAction;
    private final ReadAction readAction;
    private final FollowAction followAction;
    private final PostAction postAction;

    private ArrayList<Actions> actionList;

    public ActionList(WallAction wallAction, ReadAction readAction, FollowAction followAction, PostAction postAction) {
        this.wallAction = wallAction;
        this.readAction = readAction;
        this.followAction = followAction;
        this.postAction = postAction;
        createActionList();
    }

    @Override
    public void execute(String userInput, PostDisplay postDisplay, Repository repository) {
        for(Actions action : actionList) {
            action.execute(userInput, postDisplay, repository);
        }
    }

    private void createActionList() {
        actionList = new ArrayList<>();

        actionList.add(wallAction);
        actionList.add(readAction);
        actionList.add(postAction);
        actionList.add(followAction);
    }
}
