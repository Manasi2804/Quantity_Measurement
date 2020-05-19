package com.bl.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenZeroFeetAndZeroFeetValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getFeet(0.0);
        double value2 = quantityMeasurement.getFeet(0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenFeetValue_WhenNull_ShouldReturnFalse() {
        boolean NullValue = quantityMeasurement.equals(null);
        Assert.assertEquals(false, NullValue);
    }

    @Test
    public void givenReferenceObject_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement object = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement, object);
    }
    @Test
    public void givenTwoEqualFeetValues_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getFeet(3.0);
        double value2 = quantityMeasurement.getFeet(3.0);
        Assert.assertEquals(value1, value2, 0.0);
    }
    @Test
    public void givenDifferentFeetValues_WhenEqual_ShouldReturnFalse(){
        double value1 = quantityMeasurement.getFeet(0.0);
        double value2 = quantityMeasurement.getFeet(1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }
}