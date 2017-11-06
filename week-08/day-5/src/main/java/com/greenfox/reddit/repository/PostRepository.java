package com.greenfox.reddit.repository;

import com.greenfox.reddit.model.Post;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

  @Query(value = "SELECT * FROM posts.post ORDER BY score DESC LIMIT 10 OFFSET ?1", nativeQuery = true)
  Iterable<Post> findAllByOrderByScoreDesc(int pageId);

  @Query(value = "SELECT COUNT(*) FROM posts.post", nativeQuery = true)
  Integer numberOfRows();
}
