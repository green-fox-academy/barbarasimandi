package com.greenfox.connection.repository;

import com.greenfox.connection.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Integer> {


}
