package com.example.article_management_spring.exception;

public class UnAuthorizedParamRequestException extends RuntimeException{
    public UnAuthorizedParamRequestException() {
        super();
    }

    public UnAuthorizedParamRequestException(String message) {
        super(message);
    }
}
