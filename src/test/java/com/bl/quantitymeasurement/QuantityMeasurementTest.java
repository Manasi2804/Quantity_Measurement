package com.bl.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenZeroFeetAndZeroFeetValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getUnit(Units.FEET, 0.0);
        double value2 = quantityMeasurement.getUnit(Units.FEET, 0.0);
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
        double value1 = quantityMeasurement.getUnit(Units.FEET, 3.0);
        double value2 = quantityMeasurement.getUnit(Units.FEET, 3.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenDifferentFeetValues_WhenEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.getUnit(Units.FEET, 0.0);
        double value2 = quantityMeasurement.getUnit(Units.FEET, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    // Inch
    @Test
    public void givenZeroInchAndZeroInchValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getUnit(Units.INCH, 0.0);
        double value2 = quantityMeasurement.getUnit(Units.INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenInchValue_WhenNull_ShouldReturnFalse() {
        boolean NullValue = quantityMeasurement.equals(null);
        Assert.assertEquals(false, NullValue);
    }

    @Test
    public void givenReferenceObjectForInch_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement object = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement, object);
    }

    @Test
    public void givenTwoEqualInchValues_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getUnit(Units.INCH, 3.0);
        double value2 = quantityMeasurement.getUnit(Units.INCH, 3.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenDifferentInchValues_WhenEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.getUnit(Units.INCH, 0.0);
        double value2 = quantityMeasurement.getUnit(Units.INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenZeroFeetAndZeroInchValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getUnit(Units.FEET, 0.0);
        double value2 = quantityMeasurement.getUnit(Units.INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }
    @Test
    public void givenOneInchAndOneFeet_WhenNotEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getUnit(Units.INCH,1.0);
        double value2 = quantityMeasurement.getUnit(Units.FEET,1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }
    @Test
    public void givenOneInchAndTwelveFeet_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getUnit(Units.FEET,12.0);
        double value2 = quantityMeasurement.getUnit(Units.INCH,1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }
    @Test
    public void givenThreeFeetAndOneYardValue_WhenEqual_ShouldReturnTrue(){
        double Value1=quantityMeasurement.getUnit(Units.FEET,3.0);
        double Value2=quantityMeasurement.getUnit(Units.YARD,1.0);
        Assert.assertEquals(Value2,Value1,0.0);
    }
    @Test
    public void givenOneFeetAndOneYardValue_WhenEqual_ShouldReturnTrue(){
        double Value1=quantityMeasurement.getUnit(Units.FEET,1.0);
        double Value2=quantityMeasurement.getUnit(Units.YARD,1.0);
        Assert.assertNotEquals(Value1,Value2,0.0);
    }
    @Test
    public void givenOneInchAndOneYardValue_WhenNotEqual_ShouldReturnFalse(){
        double Value1=quantityMeasurement.getUnit(Units.FEET,1.0);
        double Value2=quantityMeasurement.getUnit(Units.YARD,3.0);
        Assert.assertNotEquals(Value1,Value2,0.0);
    }
    @Test
    public void givenOneInchAndThirtySixYardValue_WhenEqual_ShouldReturnTrue(){
        double Value1=quantityMeasurement.getUnit(Units.YARD,36.0);
        double Value2=quantityMeasurement.getUnit(Units.INCH,1.0);
        Assert.assertNotEquals(Value2,Value1,0.0);
    }
    @Test
    public void givenOneYardAndThreeFeetValue_WhenEqual_ShouldReturnTrue(){
        double Value1=quantityMeasurement.getUnit(Units.YARD,1.0);
        double Value2=quantityMeasurement.getUnit(Units.FEET,3.0);
        Assert.assertEquals(Value1,Value2,0.0);
    }
    @Test
    public void givenTwoInchAndFiveCmValue_WhenEqual_ShouldReturnTrue(){
        double Value1=quantityMeasurement.getUnit(Units.INCH,2.0);
        double Value2=quantityMeasurement.getUnit(Units.CM,5.0);
        Assert.assertEquals(Value1,Value2,0.0);
    }
    @Test
    public void givenTwoInchAndTwoInchValue_WhenAdd_ShouldReturnTrue(){
        double Value1=quantityMeasurement.getUnit(Units.INCH,2.0);
        double Value2=quantityMeasurement.getUnit(Units.INCH,2.0);
        double result=Value1+Value2;
        Assert.assertEquals(4,result,0.0);
    }
    @Test
    public void givenOneFeetAndTwoInchValue_WhenAdd_ShouldReturnTrue()
    {
        double Value1=quantityMeasurement.getUnit(Units.FEET,1.0);
        double Value2=quantityMeasurement.getUnit(Units.INCH,2.0);
        double result=Value1+Value2;
        Assert.assertEquals(14,result,0.0);
    }
}