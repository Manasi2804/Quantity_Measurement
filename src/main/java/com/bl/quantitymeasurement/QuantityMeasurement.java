package com.bl.quantitymeasurement;

public class QuantityMeasurement {
    double feet;
    double Inch;
    public double getFeet(double feet) {
        return feet;
    }
    public double getInch(double inch) {
        return inch;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.feet, feet) == 0;
    }
}