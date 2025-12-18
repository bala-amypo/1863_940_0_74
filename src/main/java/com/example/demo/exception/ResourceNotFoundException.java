package com.example.demo.exception;

public class ResorceNotFoundException extends RuntimeException{
    public ResorceNotFoundException(String message){
        super(message);
    }
}