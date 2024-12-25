package com.GinElmaC.springboot3.Exception;

public class NomoneyException extends RuntimeException{
    public NomoneyException() {
    }

    public NomoneyException(String message) {
        super(message);
    }
}
