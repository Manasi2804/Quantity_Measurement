package com.bl.quantitymeasurement;

public enum Units {
<<<<<<< HEAD
    INCH(1.0),
    FEET(1 * 12.0),
    YARD(1 * 36.0),
    CM(1 / 2.5);
=======
    INCH(1 / 12.0), FEET(1 * 12.0),YARD(1 * 36.0),CM_TO_INCH(1 / 2.5);
>>>>>>> d63b1d754ba7d0f2975d3f4197868f11ee791071
    final double unit;
    Units(double unit) {
        this.unit = unit;
    }
}