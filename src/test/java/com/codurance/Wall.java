package com.codurance;

public class Wall implements Actions {
    private final Repository repository;
    private final Console console;

    public Wall(Repository repository, Console console) {
        this.repository = repository;
        this.console = console;
    }

    @Override
    public void checkIfValidRequest(String userInput) {
        if (parseCommand(userInput)){
            execute(userInput);
        };
    }

    private void execute(String userInput) {
        User user = findOrCreateUser(userInput);
        console.print(user.getPosts());
    }

    private User findOrCreateUser(String userInput) {
        return repository.findOrCreate(userInput);
    }

    public boolean parseCommand(String userInput) {
        return userInput.split(" ").length == 1;
    }
}
