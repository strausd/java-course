package com.dannystraus;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Danny", 500);
        System.out.println("New score is " + newScore);

	    newScore = calculateScore(132);
        System.out.println("New score is " + newScore);

	    newScore = calculateScore();
        System.out.println("New score is " + newScore);

        calcFeetAndInchesToCentimeters(0, 3);
        calcFeetAndInchesToCentimeters(6, 3);
        calcFeetAndInchesToCentimeters(2, 0);
        calcFeetAndInchesToCentimeters(2, 100);
        calcFeetAndInchesToCentimeters(-1, 0);
        calcFeetAndInchesToCentimeters(1, -1);

        calcFeetAndInchesToCentimeters(100);
        calcFeetAndInchesToCentimeters(10);
        calcFeetAndInchesToCentimeters(12);
        calcFeetAndInchesToCentimeters(5.5);
        calcFeetAndInchesToCentimeters(-5.5);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0) {
            System.out.println("Incorrect data");
            return -1;
        }

        double totalInches = (feet * 12) + inches;
        double centimeters = totalInches * 2.54;
        System.out.println(feet + " feet " + inches + " inches: " + centimeters + " centimeters.");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Incorrect data");
            return -1;
        }
        double feet = (int) inches/12;
        inches = inches % 12;

        return calcFeetAndInchesToCentimeters(feet, inches);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

}
