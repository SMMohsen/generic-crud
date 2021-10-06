package com.generic.demo.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public abstract class DAOServiceImpl<T,R extends CrudRepository> implements DAOService<T> {

    private R repository;

    public DAOServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public T getById(Long id) {
        return (T) repository.findById(id).get();
    }

    @Override
    public List<T> getAll() {
        return (List<T>)repository.findAll();
    }

    @Override
    public T save(T entity) {
        return (T) repository.save(entity);
    }

    @Override
    public T update(T entity) {
        return  (T) repository.save(entity);
    }
}
