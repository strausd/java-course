package com.dannystraus;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("White", "Bison", 5);
	    hamburger.addKetchup();
	    hamburger.addLettuce();
	    hamburger.calculatePrice();
	    hamburger.showDetails();

	    Healthy healthy = new Healthy("Turkey", 6);
	    healthy.addAvocado();
	    healthy.addEgg();
	    healthy.addKetchup();
	    healthy.calculatePrice();
	    healthy.showDetails();

	    Deluxe deluxe = new Deluxe("Wheat", "beef", 7);
	    deluxe.addBacon();
	    deluxe.calculatePrice();
	    deluxe.showDetails();

    }
}
