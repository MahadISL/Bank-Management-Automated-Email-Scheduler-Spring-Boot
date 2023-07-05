package com.evamp.saanga.bankmanagement.exception;

public class CustomException extends RuntimeException{

    private String message;

    public CustomException() {}

    public CustomException(String msg)
    {
        super(msg);
        this.message = msg;
    }
}