package com.bl.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
    @Test
    public void givenZeroFeetAndZeroFeetValue_WhenEqual_ShouldReturnTrue(){
        double value1 = quantityMeasurement.getFeet(0.0);
        double value2 = quantityMeasurement.getFeet(0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }
}