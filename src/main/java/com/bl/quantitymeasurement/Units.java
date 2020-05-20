package com.bl.quantitymeasurement;

public enum Units {
    //length
    INCH(1.0),
    FEET(1 * 12.0),
    YARD(1 * 36.0),
    CM(1 / 2.5),
    //volume
    LITRE(1.0),
    GALLON_TO_LITRE(1*3.78),
    MILLILITER_TO_LITRE(1.0/1000);
    final double unit;
    Units(double unit) {
        this.unit = unit;
    }
}
