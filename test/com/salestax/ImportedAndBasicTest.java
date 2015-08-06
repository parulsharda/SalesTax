package com.salestax;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

    public class ImportedAndBasicTest {
        @Test
        public void shouldReturnValue54point625WhenInputIs47point50() {

            ImportedAndBasic importedAndBasic= new ImportedAndBasic(0.15);

            double acceptedTax = importedAndBasic.computeImportedAndBasicTaxOnBasePrice(47.50);

            assertEquals(54.625,acceptedTax);
    }
}
