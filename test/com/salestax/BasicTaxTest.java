package com.salestax;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BasicTaxTest {

    @Test
    public void shouldReturnValue16point49WhenInputIs14point99() {

        BasicTax basicTax = new BasicTax(0.1);

        double acceptedTax = basicTax.computeBasicTaxOnBasePrice(14.99);

        assertEquals(16.489,acceptedTax);
    }
}

