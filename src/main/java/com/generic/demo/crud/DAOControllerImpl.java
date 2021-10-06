package com.generic.demo.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public abstract class DAOControllerImpl<S extends DAOService,T> implements DAOController<T> {

    private S service;

    public DAOControllerImpl(S service) {
        this.service = service;
    }

    @Override
    @GetMapping("/{id}")
    public T getById(@PathVariable Long id) {
        return (T) service.getById(id);
    }

    @Override
    @GetMapping("/all")
    public List<T> getAll() {
        return service.getAll();
    }

    @Override
    @PostMapping("/")
    public T save(@RequestBody  T entity) {
        return (T) service.save(entity);
    }

    @Override
    @PutMapping("/")
    public T update(@RequestBody T entity) {
        return (T) service.save(entity);
    }
}
