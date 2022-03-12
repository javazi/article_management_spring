package com.example.article_management_spring.exception;

public class RoleNotFoundException extends RuntimeException{
    public RoleNotFoundException() {
        super();
    }

    public RoleNotFoundException(String message) {
        super(message);
    }
}
