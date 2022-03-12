package com.example.article_management_spring.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String message) {super(message);}
}
