package com.dannystraus;

public class Main {

    public static void main(String[] args) {
//	    int has a width of 32
//        int myMinValue = -2_147_483_648;
//        int myMaxValue = 2_147_483_647;

//        byte has a width of 8. -128 - 127
//        byte myByteValue = -128;

//        short has a width of 16. -32768 - 32767
//        short myShortValue = -32768;

//        long has a width of 64. 2^63
//        long myLongValue = 100L;


//        byte newByte = 50;
//        short newShort = 15001;
//        int newInt = 1600007;
//        long newLong = 50000 + 10 * (newByte + newShort + newInt);
//        System.out.println(newLong);
//
//        double pounds = 200d;
//        double kg = pounds * 0.45359237;
//        System.out.println(pounds + " pound(s) is " + kg + " kilogram(s)");
//
//        char myChar = '\u00AE';
//        System.out.println(myChar);
//
//        String myString = "freedom all day err day";
//        System.out.println(myString);
//
//        boolean isAlien = false;
//        if (isAlien)
//            System.out.println("isAlien is true");
//
//        double num = 20;
//        double secondNum = 80;
//
//        double result = (num + secondNum) * 25;
//        double remainder = result % 40;
//        if (remainder <= 20)
//            System.out.println("Total was over the limit");
//            System.out.println(remainder);


        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("High score: " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("High score: " + highScore);

        displayHighScorePosition("Danny", 7);

        System.out.println(calculateHighScorePosition(1500));
        System.out.println(calculateHighScorePosition(900));
        System.out.println(calculateHighScorePosition(400));
        System.out.println(calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

}
