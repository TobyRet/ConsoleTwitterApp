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

    }

}
