package com.greenfox.connection.repository;

import com.greenfox.connection.model.Assignee;
import com.greenfox.connection.model.Todo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Integer> {

  List<Todo> findAllByIsDone(Boolean isDone);
  List<Todo> findByAssignee(Assignee assignee);
  List<Todo> findAllByTitle(String keyWord);
}
