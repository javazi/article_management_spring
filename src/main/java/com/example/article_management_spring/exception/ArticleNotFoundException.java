package com.example.article_management_spring.exception;

public class ArticleNotFoundException extends RuntimeException{
    public ArticleNotFoundException() {
        super();
    }

    public ArticleNotFoundException(String message) {
        super(message);
    }
}
