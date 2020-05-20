package com.bl.quantitymeasurement;

public enum Units {
    // Basic Conversion
    //Length
    INCH(1.0), FEET(1*12.0), YARD(1*36.0), CM(1/2.5),
    //Volume
    LITRE(1.0), GALLON(1*3.78), MILLILITER(1.0/1000),
    //Weight
    KG(1.0), TONNE(1.0*1000), GRAMS(1.0/1000),
    //Temperature
    FAHRENHEIT(1.0), CELSIUS(1.0*2.12);

    final double unit;
    Units(double unit) {
        this.unit = unit;
    }
}
