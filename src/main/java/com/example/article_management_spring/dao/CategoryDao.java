package com.example.article_management_spring.dao;

import com.example.article_management_spring.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource(path = "categories")
public interface CategoryDao extends JpaRepository <Category,Integer> {
}
