package com.example.swimmingcalendar.controller;

import com.example.swimmingcalendar.domain.Post;
import com.example.swimmingcalendar.service.PostServiceImplementation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Post Rest Controller.
 *
 * @author kshitijbaluni
 * @since 23 July 2022
 */
@RestController
@Slf4j
@RequestMapping(value = "/post")
public class PostController {
  private PostServiceImplementation postServiceImplementation;

  @Autowired
  public PostController(PostServiceImplementation postServiceImplementation) {
    this.postServiceImplementation = postServiceImplementation;
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public Iterable<Post> getPost() {
    log.info(String.format("%s request method: %s", "/post", RequestMethod.GET));
    return postServiceImplementation.getPosts();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Optional<Post> getPost(@PathVariable(value = "id") long id) {
    log.info(String.format("%s request method: %s post id: %s", "/post", RequestMethod.GET, id));
    return postServiceImplementation.getPost(id);
  }

  @RequestMapping(value = "/", method = RequestMethod.POST)
  public void creatPost(@RequestBody Post post) {
    log.info(String.format("%s request method: %s post data: %s", "/post", RequestMethod.POST, post));
    postServiceImplementation.createPost(post);
  }

  @RequestMapping(value = "/", method = RequestMethod.DELETE)
  public void deletePost(@RequestParam long id) {
    log.info(String.format("%s request method: %s post id: %s", "/post", RequestMethod.DELETE, id));
    postServiceImplementation.deletePost(id);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public void updatePost(@RequestBody Post post, @PathVariable(value = "id") long id) {
    log.info(String.format("%s request method: %s post data: %s", "/post", RequestMethod.PUT, post));
    postServiceImplementation.updatePost(post, id);
  }
}
