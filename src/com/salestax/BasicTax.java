package com.salestax;

public class BasicTax {
    private double salesPrice = 0.1;

    public BasicTax(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double computeBasicTaxOnBasePrice(double amount) {

        return (salesPrice * amount) + amount;
    }
}
