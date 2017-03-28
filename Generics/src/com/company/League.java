package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by strausd on 3/28/2017.
 */
public class League<T extends Team> {
    private String name;
    private ArrayList<T> league = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if(league.size() < 1) {
            league.add(team);
            return true;
        } else if(league.contains(team)) {
            System.out.println("Team is already in league. Not added.");
            return false;
        } else {
            for(int i = 0; i < league.size(); i++) {
                int compare = team.getName().compareTo(league.get(i).getName());
                if(compare <= 0) {
                    league.add(i, team);
                    return true;
                }
            }
            league.add(team);
            return true;
        }
    }

    public void listTeams() {
        System.out.println("------------------------");
        for(int i = 0; i < league.size(); i++) {
            System.out.println(league.get(i).getName());
        }
        System.out.println("------------------------");
    }
}
