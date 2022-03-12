package com.example.article_management_spring.dao;


import com.example.article_management_spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao  extends JpaRepository<User,Integer> {
    public User findByUserName (String userName);
    public User findByNationalCode (String nationalCode);
    public Boolean existsUserByUserName (String userName);
    public Boolean existsUserByNationalCode (String nationalCode);
}
