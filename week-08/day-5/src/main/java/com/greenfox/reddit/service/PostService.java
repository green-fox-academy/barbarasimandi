package com.greenfox.reddit.service;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repository.PostRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;

@Configuration
public class PostService {

  @Autowired
  PostRepository postRepository;

  public Iterable<Post> listPosts() {
    return postRepository.findAllByOrderByScoreDesc();
  }

  public Integer numberOfRows() {
    return postRepository.numberOfRows();
  }

  public Post addPost() {
    return new Post();
  }

  public void upVote(Long id) {
    Post post = postRepository.findOne(id);
    post.setScore(post.getScore() + 1);
    postRepository.save(post);
  }

  public void downVote(Long id) {
    Post post = postRepository.findOne(id);
    post.setScore(post.getScore() - 1);
    postRepository.save(post);
  }
}
