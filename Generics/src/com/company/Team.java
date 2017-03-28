package com.company;

/**
 * Created by strausd on 3/28/2017.
 */
public class Team<T> {
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
