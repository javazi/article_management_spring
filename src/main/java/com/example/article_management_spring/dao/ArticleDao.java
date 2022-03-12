package com.example.article_management_spring.dao;

import com.example.article_management_spring.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleDao extends JpaRepository <Article , Integer>{
}
