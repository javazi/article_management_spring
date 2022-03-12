package com.example.article_management_spring.dao;


import com.example.article_management_spring.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao  extends JpaRepository<Role,Integer> {
    Role findRoleByTitle (String title);
}
