/*******************************************************************
 * @purpose:Compare different unit value and return converted value
 * @Author:Manasi
 * @Date:-20/5/2020
 *******************************************************************/
package com.bl.quantitymeasurement;
import com.bl.quantitymeasurement.exception.QuantityMeasurementException;

public class QuantityMeasurement{
    /*
     * @purpose:-calculate conversion
     * @param units:-value to be converted
     * @param value:-value which we convert
     * @return:-converted value
     */
    public double getUnit(Units units, double value) {
        if (value < 0) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.ENTER_VALUE, "Value Should be Correct");
        } else {
            return value * units.unit;
        }
    }
    /*
     * @purpose:-to check equality condition
     * @param obj:-null and reference
     * @return:-return true or false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj==null) return false;
        if (this==obj)return true;
        if (this.getClass()==obj.getClass())return true;
        return super.equals(obj);
    }
}