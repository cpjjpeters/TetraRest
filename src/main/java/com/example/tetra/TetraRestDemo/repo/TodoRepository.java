package com.example.tetra.TetraRestDemo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.tetra.TetraRestDemo.model.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
