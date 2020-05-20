package com.bl.quantitymeasurement;

import com.bl.quantitymeasurement.exception.QuantityMeasurementException;
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
        double value1 = quantityMeasurement.getUnit(Units.INCH, 1.0);
        double value2 = quantityMeasurement.getUnit(Units.FEET, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneInchAndTwelveFeet_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getUnit(Units.FEET, 12.0);
        double value2 = quantityMeasurement.getUnit(Units.INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenThreeFeetAndOneYardValue_WhenEqual_ShouldReturnTrue() {
        double Value1 = quantityMeasurement.getUnit(Units.FEET, 3.0);
        double Value2 = quantityMeasurement.getUnit(Units.YARD, 1.0);
        Assert.assertEquals(Value2, Value1, 0.0);
    }

    @Test
    public void givenOneFeetAndOneYardValue_WhenEqual_ShouldReturnTrue() {
        double Value1 = quantityMeasurement.getUnit(Units.FEET, 1.0);
        double Value2 = quantityMeasurement.getUnit(Units.YARD, 1.0);
        Assert.assertNotEquals(Value1, Value2, 0.0);
    }

    @Test
    public void givenOneInchAndOneYardValue_WhenNotEqual_ShouldReturnFalse() {
        double Value1 = quantityMeasurement.getUnit(Units.FEET, 1.0);
        double Value2 = quantityMeasurement.getUnit(Units.YARD, 3.0);
        Assert.assertNotEquals(Value1, Value2, 0.0);
    }

    @Test
    public void givenOneInchAndThirtySixYardValue_WhenEqual_ShouldReturnTrue() {
        double Value1 = quantityMeasurement.getUnit(Units.YARD, 36.0);
        double Value2 = quantityMeasurement.getUnit(Units.INCH, 1.0);
        Assert.assertNotEquals(Value2, Value1, 0.0);
    }

    @Test
    public void givenOneYardAndThreeFeetValue_WhenEqual_ShouldReturnTrue() {
        double Value1 = quantityMeasurement.getUnit(Units.YARD, 1.0);
        double Value2 = quantityMeasurement.getUnit(Units.FEET, 3.0);
        Assert.assertEquals(Value1, Value2, 0.0);
    }

    @Test
    public void givenTwoInchAndFiveCmValue_WhenEqual_ShouldReturnTrue() {
        double Value1 = quantityMeasurement.getUnit(Units.INCH, 2.0);
        double Value2 = quantityMeasurement.getUnit(Units.CM, 5.0);
        Assert.assertEquals(Value1, Value2, 0.0);
    }

    @Test
    public void givenTwoInchAndTwoInchValue_WhenAdd_ShouldReturnResult() {
        double Value1 = quantityMeasurement.getUnit(Units.INCH, 2.0);
        double Value2 = quantityMeasurement.getUnit(Units.INCH, 2.0);
        double result = Value1 + Value2;
        Assert.assertEquals(4, result, 0.0);
    }

    @Test
    public void givenOneFeetAndTwoInchValue_WhenAdd_ShouldReturnResult() {
        double Value1 = quantityMeasurement.getUnit(Units.FEET, 1.0);
        double Value2 = quantityMeasurement.getUnit(Units.INCH, 2.0);
        double result = Value1 + Value2;
        Assert.assertEquals(14, result, 0.0);
    }

    @Test
    public void givenOneFeetAndOneFeetValue_WhenAdd_ShouldReturnResult() {
        double Value1 = quantityMeasurement.getUnit(Units.FEET, 1.0);
        double Value2 = quantityMeasurement.getUnit(Units.FEET, 1.0);
        Assert.assertEquals(24, Value1 + Value2, 0.0);
    }

    @Test
    public void givenTwoInchAndTwoPointFiveCmValue_WhenAdd_ShouldReturnResult() {
        double Value1 = quantityMeasurement.getUnit(Units.INCH, 2.0);
        double Value2 = quantityMeasurement.getUnit(Units.CM, 2.5);
        Assert.assertEquals(3, Value1 + Value2, 0.0);
    }

    @Test
    public void givenOneGallonAndThreePointSevenEightLitValue_WhenEqual_ShouldReturnTrue() {
        double Value1 = quantityMeasurement.getUnit(Units.GALLON_TO_LITRE, 1.0);
        double Value2 = quantityMeasurement.getUnit(Units.LITRE, 3.78);
        Assert.assertEquals(Value1, Value2, 0.0);
    }

    @Test
    public void givenOneLitreAndOneThousandMilliLitre_WhenEqual_ShouldReturnTrue() {
        double Value1 = quantityMeasurement.getUnit(Units.LITRE, 1.0);
        double Value2 = quantityMeasurement.getUnit(Units.MILLILITER_TO_LITRE, 1000);
        Assert.assertEquals(Value1, Value2, 0.0);
    }
    @Test
    public void givenOneGallonAndThreePointSevenEightLit_WhenAdd_ShouldReturnResult() {
        double Value1 = quantityMeasurement.getUnit(Units.GALLON_TO_LITRE, 1.0);
        double Value2 = quantityMeasurement.getUnit(Units.LITRE, 3.78);
        Assert.assertEquals(7.56, Value1 + Value2, 0.0);
    }
    @Test
    public void givenOneLitreAndOneThousandMilliLitre_WhenAdd_ShouldReturnResult() {
        double Value1 = quantityMeasurement.getUnit(Units.LITRE, 1.0);
        double Value2 = quantityMeasurement.getUnit(Units.MILLILITER_TO_LITRE, 1000);
        Assert.assertEquals(2, Value1 + Value2, 0.0);
    }
    @Test
    public void givenOneTonneAndOneThousandGrams_WhenAdded_ShouldReturnResult(){
        double Value1=quantityMeasurement.getUnit(Units.TONNE_TO_KG,1.0);
        double Value2=quantityMeasurement.getUnit(Units.GRAMS_TO_KG,1000.0);
        Assert.assertEquals(1001.0,Value1+Value2,0.0);
    }
    @Test
    public void givenOneTonneAndOneThousandGrams_WhenNegative_ShouldReturnException() {
        try {
            double Value1 = quantityMeasurement.getUnit(Units.TONNE_TO_KG, -1.0);
            double Value2 = quantityMeasurement.getUnit(Units.GRAMS_TO_KG, 1000);
            Assert.assertEquals(Value1, Value2, 0.0);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals("Value Should be Correct", e.getMessage());
        }
    }
}