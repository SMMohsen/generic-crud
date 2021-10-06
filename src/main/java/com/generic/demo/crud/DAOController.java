package com.generic.demo.crud;

import java.util.List;

public interface DAOController<T> {

    public T getById(Long id);
    public List<T> getAll();
    public T save(T entity);
    public T update(T entity);
}
