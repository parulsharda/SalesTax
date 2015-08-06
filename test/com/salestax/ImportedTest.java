package com.salestax;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ImportedTest {


    @Test
    public void shouldReturnValue13point11WhenInputIs12point49() {

        Imported imported = new Imported(0.05);

        double acceptedTax = imported.computeImportedTaxOnBasePrice(12.49);
        assertEquals(13.1145,acceptedTax);
    }
}
