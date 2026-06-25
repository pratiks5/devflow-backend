package com.devflow.exception;

public class BusinessUnitNotFoundException extends RuntimeException{
    public BusinessUnitNotFoundException(String message) {
        super(message);
    }
}
