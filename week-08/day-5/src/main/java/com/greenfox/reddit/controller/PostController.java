package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostController {

  @Autowired
  PostRepository postRepository;

  @GetMapping({"/", ""})
  public String listPosts(Model model) {
    model.addAttribute("posts", postRepository.findAll());
    return "posts";
  }

  @GetMapping(value = "/add")
  public String addPost(Model model) {
    model.addAttribute("newPost", new Post());
    return "addpost";
  }

//  @PostMapping(value = "/list/addTodo")
//  public String addNew(@ModelAttribute Todo todo) {
//    todoRepository.save(todo);
//    return "redirect:/todo/list";
//  }

}
