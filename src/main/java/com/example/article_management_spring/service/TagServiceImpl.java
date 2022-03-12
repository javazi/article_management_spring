package com.example.article_management_spring.service;

import com.example.article_management_spring.dao.TagDao;
import com.example.article_management_spring.entity.Tag;
import com.example.article_management_spring.exception.TagNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TagServiceImpl implements GeneralService<Tag, Integer> {
    private TagDao tagDao;

    @Autowired
    public TagServiceImpl(TagDao tagDao) {
        this.tagDao = tagDao;
    }

    @Transactional()
    @Override
    public List<Tag> findAll() {
        return tagDao.findAll();
    }

    @Transactional()
    @Override
    public Tag findById(Integer id) {
        Optional<Tag> byId = tagDao.findById(id);
        if (byId.isPresent())
            return byId.get();
        else throw new TagNotFoundException("Tag not found!");
    }

    @Transactional()
    @Override
    public Tag save(Tag entity) {
        return tagDao.save(entity);
    }

    @Transactional()
    @Override
    public void delete(Tag entity) {
        tagDao.delete(entity);
    }
}
