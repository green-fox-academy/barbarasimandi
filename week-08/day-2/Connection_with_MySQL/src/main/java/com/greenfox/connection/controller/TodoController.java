package com.greenfox.connection.controller;

import com.greenfox.connection.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping({"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todoslist";
  }


}
