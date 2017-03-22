package com.dannystraus;

/**
 * Created by dstraus on 3/22/17.
 */
public class Healthy extends Hamburger{
    private String meat;
    private double basePrice;
    private double price;
    private boolean lettuce = true;
    private boolean tomato = true;
    private boolean pickles = true;
    private boolean ketchup = false;
    private boolean avocado = false;
    private boolean egg = false;
    private double extraCharge = 0.50;
    private double totalExtra = 0.0;

    public Healthy(String meat, double basePrice) {
        super("Brown Rye", meat, basePrice);
        this.meat = meat;
        this.basePrice = basePrice;

    }

    public void addKetchup() {
        this.ketchup = true;
    }

    public void addAvocado() {
        this.avocado = true;
    }

    public void addEgg() {
        this.egg = true;
    }

    @Override
    public void calculatePrice() {
        if(this.ketchup) {
            this.totalExtra += this.extraCharge;
        }
        if(this.avocado) {
            this.totalExtra += this.extraCharge;
        }
        if(this.egg) {
            this.totalExtra += this.extraCharge;
        }
        this.price = this.basePrice + this.totalExtra;

    }

    @Override
    public void showDetails() {
        String details = "Healthy Hamburger details: \n" +
                "Base price: $" + this.basePrice + "\n";
        if(this.ketchup) {
            details += "Ketchup: +$" + this.extraCharge + "\n";
        }
        if(this.avocado) {
            details += "Avocado: +$" + this.extraCharge + "\n";
        }
        if(this.egg) {
            details += "Egg: +$" + this.extraCharge + "\n";
        }
        details += "Total price: $" + this.price + "\n";

        System.out.println(details);
    }

}
