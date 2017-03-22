package com.dannystraus;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    private static MobilePhone danny = new MobilePhone("469-443-8771", "Danny");

    public static void main(String[] args) {
	    boolean isRunning = true;
	    danny.displayOptions();

	    while (isRunning) {
            int selected = scan.nextInt();
            switch (selected){
                case 0:
                    danny.displayOptions();
                    break;
                case 1:
                    danny.listContacts();
                    break;
                case 2:
                    danny.createContact();
                    break;
                case 3:
                    danny.editContact();
                    break;
                case 4:
                    danny.deleteContact();
                    break;
                case 5:
                    danny.queryContact();
                    break;
                case 6:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Please input a valid option.");
            }
        }
    }

}
