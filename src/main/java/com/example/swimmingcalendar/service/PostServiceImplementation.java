package com.example.swimmingcalendar.service;

import com.example.swimmingcalendar.domain.Post;
import com.example.swimmingcalendar.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Post Service CRUD Implementation.
 *
 * @author kshitijbaluni
 * @since 23 July 2022
 */
@Service
public class PostServiceImplementation implements PostService {
  private PostRepository postRepository;

  @Autowired
  public PostServiceImplementation(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public Iterable<Post> getPosts() {
    return postRepository.findAll();
  }

  @Override
  public Optional<Post> getPost(long id) {
    return postRepository.findById(id);
  }

  @Override
  public void createPost(Post post) {
    postRepository.save(post);
  }

  @Override
  public void updatePost(Post post, long id) {
    postRepository.save(Post.builder()
                          .postId(post.getPostId())
                          .postAuthor(post.getPostAuthor())
                          .postName(post.getPostName())
                          .postDescription(post.getPostDescription())
                          .build());
  }

  @Override
  public void deletePost(long id) {
    postRepository.deleteById(id);
  }
}
