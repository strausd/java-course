package com.dannystraus;

/**
 * Created by dstraus on 3/22/17.
 */
public class Hamburger {
    private String breadType;
    private String meat;
    private double basePrice;
    private double price;
    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean ketchup = false;
    private boolean pickles = false;
    private double extraCharge = 0.50;
    private double totalExtra = 0.0;

    public Hamburger(String breadType, String meat, double basePrice) {
        this.breadType = breadType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public void addLettuce() {
        this.lettuce = true;
    }

    public void addTomato() {
        this.tomato = true;
    }

    public void addKetchup() {
        this.ketchup = true;
    }

    public void addPickles() {
        this.pickles = true;
    }

    public void calculatePrice() {
        if(this.lettuce) {
            this.totalExtra += this.extraCharge;
        }
        if(this.tomato) {
            this.totalExtra += this.extraCharge;
        }
        if(this.ketchup) {
            this.totalExtra += this.extraCharge;
        }
        if(this.pickles) {
            this.totalExtra += this.extraCharge;
        }
        this.price = this.basePrice + this.totalExtra;

    }

    public double getPrice() {
        return this.price;
    }

    public void showDetails() {
        String details = "Hamburger details: \n" +
                                "Base price: $" + this.basePrice + "\n";
        if(this.lettuce) {
            details += "Lettuce: +$" + this.extraCharge + "\n";
        }
        if(this.tomato) {
            details += "Tomato: +$" + this.extraCharge + "\n";
        }
        if(this.ketchup) {
            details += "Ketchup: +$" + this.extraCharge + "\n";
        }
        if(this.pickles) {
            details += "Pickles: +$" + this.extraCharge + "\n";
        }
        details += "Total price: $" + this.price + "\n";

        System.out.println(details);
    }

}
