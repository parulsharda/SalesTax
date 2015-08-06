package com.salestax;

public class ImportedAndBasic {
    private double salesPrice = 0.15;

    public ImportedAndBasic(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double computeImportedAndBasicTaxOnBasePrice(double amount) {
        return (salesPrice * amount) + amount;
    }
}
