package com.example.swimmingcallender.service;

import com.example.swimmingcallender.domain.Post;

import java.util.List;

/**
 * Post CRUD interface.
 *
 * @author kshitijbaluni
 * @since 23 July 2022
 */
public interface PostService {
  public List<Post> getPosts();
  public Post getPost(long id);
  public void createPost(Post post);
  public void updatePost(Post post);
  public void deletePost(long id);
}
