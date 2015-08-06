package com.salestax;

public class Imported {
    private double salesPrice = 0.05;

    public Imported(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double computeImportedTaxOnBasePrice(double amount)
    {
        return (salesPrice * amount) + amount;
    }
}


