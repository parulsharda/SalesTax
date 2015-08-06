package com.salestax;

public class Imported {
    private double salesPrice = 0.05;

    public double computeImportedTaxOnBasePrice(double amount)
    {
        double tax = (salesPrice * amount) + amount;
        return tax;
    }
}


