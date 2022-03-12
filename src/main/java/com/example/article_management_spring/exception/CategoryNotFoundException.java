package com.example.article_management_spring.exception;

public class CategoryNotFoundException extends RuntimeException{
    public CategoryNotFoundException() {
        super();
    }

    public CategoryNotFoundException(String message) {
        super(message);
    }
}
