package com.dannystraus;
import java.util.Arrays;
import java.util.Scanner;

// [5,23,3,87,4]

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How large would you like the array?");
        int n = scan.nextInt();
        int[] intArray = getIntegers(n);
	    int[] newArray = sortIntegers(intArray);
	    printArray(newArray);

    }

    public static int[] getIntegers(int n) {
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Please enter a number for the integer array");
            array[i] = scan.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] newArray = array.clone();
        Arrays.sort(newArray);

        for(int i = 0; i < newArray.length/2; i++) {
            int[] temp = newArray.clone();
            newArray[newArray.length-1-i] = temp[i];
            newArray[i] = temp[newArray.length-1-i];
        }

        return newArray;
    }

}
