package com.bl.quantitymeasurement.exception;

public class QuantityMeasurementException extends RuntimeException {
        public enum ExceptionType {
            ENTER_VALUE
        }
        public ExceptionType type;
    public QuantityMeasurementException(ExceptionType type,String message) {
            super(message);
            this.type=type;
        }
    }