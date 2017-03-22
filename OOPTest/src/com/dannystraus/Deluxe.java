package com.dannystraus;

/**
 * Created by dstraus on 3/22/17.
 */
public class Deluxe extends Hamburger{
    private String breadType;
    private String meat;
    private double basePrice;
    private double price;
    private boolean lettuce = true;
    private boolean tomato = true;
    private boolean pickles = true;
    private boolean ketchup = false;
    private boolean avocado = true;
    private boolean egg = true;
    private boolean bacon = false;
    private boolean chips = true;
    private boolean drink = true;
    private double extraCharge = 1.00;
    private double totalExtra = 0.0;

    public Deluxe(String breadType, String meat, double basePrice) {
        super(breadType, meat, basePrice);
        this.breadType = breadType;
        this.meat = meat;
        this.basePrice = basePrice;

    }

    public void addBacon() {
        this.bacon = true;
    }

    @Override
    public void calculatePrice() {
        if(this.bacon) {
            this.totalExtra += this.extraCharge;
        }
        if(this.chips) {
            this.totalExtra += this.extraCharge;
        }
        if(this.drink) {
            this.totalExtra += this.extraCharge;
        }
        this.price = this.basePrice + this.totalExtra;

    }

    @Override
    public void showDetails() {
        String details = "Deluxe Hamburger details: \n" +
                "Base price: $" + this.basePrice + "\n";
        if(this.bacon) {
            details += "Bacon: +$" + this.extraCharge + "\n";
        }
        if(this.chips) {
            details += "Chips: +$" + this.extraCharge + "\n";
        }
        if(this.drink) {
            details += "Drink: +$" + this.extraCharge + "\n";
        }
        details += "Total price: $" + this.price + "\n";

        System.out.println(details);
    }

}
