package com.labor.Repository;

import java.util.List;

public abstract class InMemoryRepository<T> implements ICrudRepository<T> {
    protected List<T> repo;

    public InMemoryRepository(List<T> repo) {

        this.repo = repo;
    }

    @Override
    public Iterable<T> findAll() {

        return this.repo;
    }

}