package com.greenfox.connection.controller;

import com.greenfox.connection.model.Todo;
import com.greenfox.connection.repository.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping({"/", "/list"})
  public String list(@RequestParam(required = false) boolean isActive, Model model) {
    List<Todo> todoList = new ArrayList<>();
    for (Todo todo: todoRepository.findAll()) {
      if (isActive) {
        if (!todo.isDone()) {
          todoList.add(todo);
        }
      } else if (!isActive) {
        todoList.add(todo);
      }
    }
    model.addAttribute("todos", todoList);
    return "todoslist";
  }


}
