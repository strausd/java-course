package com.dannystraus;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "500W", dimensions);

        Monitor theMonitor = new Monitor("Ultrasharp", "Dell", 24, new Resolution(1920, 1200));

        Motherboard theMotherboard = new Motherboard("Sabertooth", "Asus", 8, 6, "UEFI");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        System.out.println(thePC.getMonitor().getNativeResolution().getWidth());
        thePC.getMonitor().drawPixelAt(1500, 900, "blue");
        thePC.getMotherboard().loadProgram("Photoshop");
        thePC.getCase().pressPowerButton();

    }
}
