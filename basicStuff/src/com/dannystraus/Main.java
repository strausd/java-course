package com.dannystraus;

public class Main {

    public static void main(String[] args) {
//	    int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

//        byte has a width of 8. -128 - 127
        byte myByteValue = -128;

//        short has a width of 16. -32768 - 32767
        short myShortValue = -32768;

//        long has a width of 64. 2^63
        long myLongValue = 100L;


        byte newByte = 50;
        short newShort = 15001;
        int newInt = 1600007;
        long newLong = 50000 + 10 * (newByte + newShort + newInt);
        System.out.println(newLong);

        double pounds = 200d;
        double kg = pounds * 0.45359237;
        System.out.println(pounds + " pound(s) is " + kg + " kilogram(s)");

        char myChar = '\u00AE';
        System.out.println(myChar);

        String myString = "freedom all day err day";
        System.out.println(myString);
    }
}
