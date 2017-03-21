package com.dannystraus;

public class Main {

    public static void main(String[] args) {
//        int value = 2;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if(value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

//        int switchValue = 4;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3:case 4:case 5:
//                System.out.println("Value was " + switchValue);
//                break;
//            default:
//                System.out.println("Value was not 1 or 2");
//                break;
//        }
//
//        char letter = 'b';
//
//        switch(letter) {
//            case 'a':case 'b':case 'c':case 'd':case 'e':
//                System.out.println("Letter was " + letter);
//                break;
//            default:
//                System.out.println("Not found");
//                break;
//
//        }


        System.out.println("10,000 at 2% interest: " + calculateInterest(10000, 2));

        for(int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest: " + calculateInterest(10000, i));
        }

        int primeNumbers = 0;
        for(int i = 500; i < 1000 && primeNumbers < 3; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                primeNumbers++;
            }
        }

        int count = 0;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("Count is " + count);
            count++;
        }

        System.out.println(isEvenNumber(5));
        System.out.println(isEvenNumber(6));

        int evenNumbers = 0;
        for(int i = 10; evenNumbers < 5; i++) {
            if (isEvenNumber(i)) {
                System.out.println(i + " is an even number.");
                evenNumbers++;
            }
        }

    }

    public static boolean isEvenNumber(int n) {
        return n % 2 == 0;
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate/100);
    }

}
