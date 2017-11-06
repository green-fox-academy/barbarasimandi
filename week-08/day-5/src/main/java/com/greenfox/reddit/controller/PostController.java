package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repository.PostRepository;
import com.greenfox.reddit.service.PostService;
import java.util.List;
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
@RequestMapping("/posts")
public class PostController {

  @Autowired
  PostRepository postRepository;

  @Autowired
  PostService postService;

  @RequestMapping({"/", ""})
  public String listPosts(@RequestParam(value = "pageId", defaultValue = "0") int pageId, Model model) {
    if (pageId < 0 || pageId > postService.numberOfRows() / 10 + 1) {
      return "redirect:/posts";
    }
    model.addAttribute("posts", postService.listPosts(pageId));
    model.addAttribute("pageId", pageId);
    model.addAttribute("nrOfRows", postService.numberOfRows());
    return "posts";
  }

  @GetMapping(value = "/add")
  public String addPost(Model model) {
    model.addAttribute("newPost", postService.addPost());
    return "addpost";
  }

  @PostMapping(value = "/add")
  public String addNew(@ModelAttribute Post post) {
    postRepository.save(post);
    return "redirect:/posts";
  }

  @GetMapping(value = "/upvote/{id}")
  public String upvote(@PathVariable Long id) {
   postService.upVote(id);
    return "redirect:/posts";
  }

  @GetMapping(value = "/downvote/{id}")
  public String downvote(@PathVariable Long id) {
    postService.downVote(id);
    return "redirect:/posts";
  }
}
