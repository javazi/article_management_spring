package com.example.article_management_spring.exception;

public class TagNotFoundException extends RuntimeException{
    public TagNotFoundException() {
        super();
    }

    public TagNotFoundException(String message) {
        super(message);
    }
}
