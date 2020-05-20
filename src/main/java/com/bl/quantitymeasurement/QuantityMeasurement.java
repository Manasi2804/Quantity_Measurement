package com.bl.quantitymeasurement;
import com.bl.quantitymeasurement.exception.QuantityMeasurementException;

public class QuantityMeasurement{

    public double getUnit(Units units, double value) {
        if (value < 0) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.ENTER_VALUE, "Value Should be Correct");
        } else {
            return value * units.unit;
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (obj==null) return false;
        if (this==obj)return true;
        if (this.getClass()==obj.getClass())return true;
        return super.equals(obj);
    }
}
