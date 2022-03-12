package com.example.article_management_spring.service;

import com.example.article_management_spring.dao.UserDao;
import com.example.article_management_spring.entity.User;
import com.example.article_management_spring.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements GeneralService<User, Integer> {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional()
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
    @Transactional()
    @Override
    public User findById(Integer id) {
        Optional<User> byId = userDao.findById(id);
        if(byId.isPresent())
        return byId.get();
        else throw new UserNotFoundException("User not found!");
    }
    @Transactional()
    @Override
    public User save(User entity) {
        return userDao.save(entity);
    }

    @Transactional()
    @Override
    public void delete(User entity) {
    userDao.delete(entity);
    }

    @Transactional()
    public User findByUsername(String username){
        User user = userDao.findByUserName(username);
        if (user==null)
            throw new UserNotFoundException("User not found!");
        return user;
    }

    @Transactional()
    public User findUserByName(String username){
        User user = userDao.findByUserName(username);
        return user;
    }
    @Transactional()
    public User findByNationalCode(String nationalCode){
        User user = userDao.findByNationalCode(nationalCode);
        return user;
    }
    @Transactional
    public Boolean existsUserByUserName (String userName){
        return userDao.existsUserByUserName(userName);
    }
    @Transactional
    public Boolean existsUserByNationalCode (String nationalCode){
        return userDao.existsUserByNationalCode(nationalCode);
    }
}
