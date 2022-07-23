package com.example.swimmingcalendar.service;

import com.example.swimmingcalendar.domain.Post;

import java.util.Optional;

/**
 * Post CRUD interface.
 *
 * @author kshitijbaluni
 * @since 23 July 2022
 */
public interface PostService {
  public Iterable<Post> getPosts();
  public Optional<Post> getPost(long id);
  public void createPost(Post post);
  public void updatePost(Post post, long id);
  public void deletePost(long id);
}
