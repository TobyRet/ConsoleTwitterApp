package com.codurance;

public class Wall implements Actions {
    private final Repository repository;
    private final Console console;

    public Wall(Repository repository, Console console) {
        this.repository = repository;
        this.console = console;
    }

    @Override
    public void execute(String userInput) {
        if(isValid(userInput)) {
            retrieveUserAccount();
//            user.getPosts();
        }
    }

    private User retrieveUserAccount() {
        return repository.findOrCreate("Alice");
    }

    private boolean isValid(String userInput) {
        return userInput.split(" ").length == 1;
    }
}
