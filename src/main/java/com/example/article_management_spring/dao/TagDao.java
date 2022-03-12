package com.example.article_management_spring.dao;


import com.example.article_management_spring.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagDao  extends JpaRepository<Tag,Integer> {
}
