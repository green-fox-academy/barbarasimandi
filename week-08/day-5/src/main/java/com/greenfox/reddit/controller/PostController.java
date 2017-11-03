package com.greenfox.reddit.controller;

import com.greenfox.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostController {

  @Autowired
  PostRepository postRepository;

  @RequestMapping("/")
  public String listPosts(Model model) {
    model.addAttribute("posts", postRepository.findAll());
    return "posts";
  }

}
