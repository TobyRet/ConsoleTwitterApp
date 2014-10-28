package com.codurance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {

    public void print(String post) {
        System.out.print(post + "\n");
    }

    public String getUserCommand() throws IOException {
        System.out.println("Enter command >> ");
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        return userInput.readLine();
    }
}
