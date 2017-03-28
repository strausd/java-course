package com.company;

public class Main {

    public static void main(String[] args) {
		League<Team<BaseballTeam>> mlb = new League<>("MLB");
		System.out.println(mlb.getName());

		Team<BaseballTeam> a = new Team<>("a");
		Team<BaseballTeam> b = new Team<>("b");
		Team<BaseballTeam> c = new Team<>("c");
		Team<BaseballTeam> d = new Team<>("d");
		Team<BaseballTeam> e = new Team<>("e");


		Team<FootballTeam> cowboys = new Team<>("Dallas Cowboys");
		System.out.println(cowboys.getName());

		mlb.addTeam(e);
		mlb.addTeam(b);
		mlb.addTeam(c);
		mlb.addTeam(c);
		mlb.addTeam(d);
		mlb.addTeam(a);
		mlb.listTeams();
//		mlb.addTeam(cowboys);


    }
}
