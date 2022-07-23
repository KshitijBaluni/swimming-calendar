package com.example.swimmingcallender.service;

import com.example.swimmingcallender.domain.Post;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Post Service CRUD Implementation.
 *
 * @author kshitijbaluni
 * @since 23 July 2022
 */
@Service
public class PostServiceImplementation implements PostService {
  @Override
  public List<Post> getPosts() {
    return List.of(Post.builder()
                     .postId(1)
                     .postName("My First Post")
                     .postDescription("Test Post")
                     .postAuthor("Kshitij")
                     .createAt(new Date()).build());
  }

  @Override
  public Post getPost(long id) {
    return Post.builder()
      .postId(1)
      .postName("My First Post")
      .postDescription("Test Post")
      .postAuthor("Kshitij")
      .createAt(new Date()).build();
  }

  @Override
  public void createPost(Post post) {

  }

  @Override
  public void updatePost(Post post) {

  }

  @Override
  public void deletePost(long id) {

  }
}
