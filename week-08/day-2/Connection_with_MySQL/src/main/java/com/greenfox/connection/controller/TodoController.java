package com.greenfox.connection.controller;

import com.greenfox.connection.model.Assignee;
import com.greenfox.connection.model.Todo;
import com.greenfox.connection.repository.AssigneeRepository;
import com.greenfox.connection.repository.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @Autowired
  AssigneeRepository assigneeRepository;

  @RequestMapping({"/", "/list"})
  public String list(@RequestParam(required = false) Boolean isActive, Model model) {

    if (isActive == null) {
      model.addAttribute("todos", todoRepository.findAll());
    } else {
      model.addAttribute("todos", todoRepository.findAllByIsDone(!isActive));
    }

    return "todoslist";
  }

  @GetMapping(value = "/list/addTodo")
  public String addTodo(Model model) {
    model.addAttribute("newTodo", new Todo());
    return "addtodo";
  }

  @PostMapping(value = "/list/addTodo")
  public String addNew(@ModelAttribute Todo todo) {
  todoRepository.save(todo);
    return "redirect:/todo/list";
  }

  @PostMapping(value = "/deleteTodo/{id}")
  public String deleteTodo(@PathVariable int id, Model model) {
    model.addAttribute("delete", todoRepository.findOne(id));
    todoRepository.delete(id);
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/list/editTodo/{id}")
  public String editTodo(@PathVariable int id, Model model) {
    model.addAttribute("editTodo", todoRepository.findOne(id));
    model.addAttribute("listOfAssignees", assigneeRepository.findAll());
    return "edittodo";
  }

  @PostMapping(value = "/list/updateTodo")
  public String updateTodo(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/todos/list/{id}")
  public String assigneeTodo(@PathVariable long id, Model model) {

    Assignee assig = assigneeRepository.findOne(id);
    model.addAttribute("todos", todoRepository.findByAssignee(assig));
    model.addAttribute("assignee", assig);
    return "todoslist";
  }
}
