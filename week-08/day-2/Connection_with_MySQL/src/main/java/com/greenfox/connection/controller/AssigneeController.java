package com.greenfox.connection.controller;

import com.greenfox.connection.model.Assignee;
import com.greenfox.connection.model.Todo;
import com.greenfox.connection.repository.AssigneeRepository;
import com.greenfox.connection.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/assignees")
public class AssigneeController {

  @Autowired
  AssigneeRepository assigneeRepository;

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping({"", "/"})
  public String list(Model model) {
    model.addAttribute("assignees", assigneeRepository.findAll());
    return "assignee";
  }

  @GetMapping("/addAssignee")
  public String showAssignee(Model model) {
    model.addAttribute("newAssignee", new Assignee());
    return "addassignee";
  }

  @PostMapping(value = "/addAssignee")
  public String addNew(@ModelAttribute Assignee assignee) {
    assigneeRepository.save(assignee);
    return "redirect:/assignees";
  }

  @PostMapping(value = "/deleteAssignee/{id}")
  public String deleteAssignee(@PathVariable long id, Model model) {
    model.addAttribute("delete", assigneeRepository.findOne(id));
    assigneeRepository.delete(id);
    return "redirect:/assignees";
  }

  @GetMapping(value = "/editAssignee/{id}")
  public String editAssignee(@PathVariable long id, Model model) {
    model.addAttribute("editAssignee", assigneeRepository.findOne(id));
    return "editassignee";
  }

  @PostMapping(value = "/updateAssignee")
  public String updateAssignee(@ModelAttribute Assignee assignee) {
    assigneeRepository.save(assignee);
    return "redirect:/assignees";
  }

  @GetMapping(value = "/todos/list/{id}")
  public String assigneeTodo(@PathVariable long id, Model model) {
    Assignee assig = assigneeRepository.findOne(id);
      model.addAttribute("todos", todoRepository.findByAssignee(assig));
    return "todoslist";
  }
}
