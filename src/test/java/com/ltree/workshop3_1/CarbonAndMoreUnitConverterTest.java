package com.ltree.workshop3_1;

import org.junit.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarbonAndMoreUnitConverterTest {
    private static final double MILES = 23.78;
    private static final double KILOMETERS = 38.27;
    private static final double KILOGRAMS = 455.30;
    private static final double POUNDS = 1003.76;
    /**
     * Epsilon is the value that the 2 numbers can be off by. This accounts for
     * rounding errors in the calculation. Note each unit has its different
     * degree of variance, so this is a nice way to express how accurate the
     * results are.
     */
    private static final double EPSILON_MILES = 0.01;
    private static final double EPSILON_KILOMETERS = 0.01;
    private static final double EPSILON_KILOGRAMS = 0.01;
    private static final double EPSILON_POUNDS = 0.01;
    
    /* The class to be tested or "System under Test (SUT)" */
    CarbonAndMoreUnitConverter carbonAndMoreUnitConverter;
    @Before
    public void setUp() throws Exception {
    	carbonAndMoreUnitConverter = new CarbonAndMoreUnitConverter();
    }

    @After
    public void tearDown() throws Exception {
    	carbonAndMoreUnitConverter = new CarbonAndMoreUnitConverter();
    }

   // @Test
   // public void shouldConvertBasicKilogramUnit() {
   //     double result = carbonAndMoreUnitConverter.kilogramsToPounds(1);
   //     Assert.assertEquals(CarbonAndMoreUnitConverter.ONE_KILOGRAM_AS_POUNDS, result, EPSILON_POUNDS);
   // }

    @Test
    public void shouldConvertBasicMileUnit() {
        double result = carbonAndMoreUnitConverter.milesToKilometers(1);
        Assert.assertEquals(CarbonAndMoreUnitConverter.ONE_MILE_AS_KILOMETER, result, EPSILON_KILOMETERS);
    }

    @Test
    public void shouldConvertMilesToKilometers() {
        double result = carbonAndMoreUnitConverter.milesToKilometers(MILES);
        Assert.assertEquals(KILOMETERS, result, EPSILON_KILOMETERS);
    }

    @Test
    public void shouldConvertPoundsToKilograms() {
        double result = carbonAndMoreUnitConverter.poundsToKilograms(POUNDS);
        Assert.assertEquals(KILOGRAMS, result, EPSILON_KILOGRAMS);
    }

    @Test
    public void shouldConvertKilometersToMiles() {
        double result = carbonAndMoreUnitConverter.kilometersToMiles(KILOMETERS);
        Assert.assertEquals(MILES, result, EPSILON_MILES);
    }

   // @Test
   // public void shouldConvertKilogramsToPounds() {
     //   double result = carbonAndMoreUnitConverter.kilogramsToPounds(KILOGRAMS);
     //   Assert.assertEquals(POUNDS, result, EPSILON_POUNDS);
   // }

}
