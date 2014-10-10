package com.codurance;

public interface Repository {
    public User findOrCreate(String userName);
}
