package com.example.swimmingcallender.controller;

import com.example.swimmingcallender.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Page Controller.
 *
 * @author kshitijbaluni
 * @since 23 July 2022
 */
@RestController
public class PageController {
  @RequestMapping("/home")
  public String home() {
    return User.builder()
      .id(1)
      .firstName("Kshitij")
      .lastName("Baluni")
      .email("kbaluni@gmail.com")
      .build()
      .toString();
  }

  @RequestMapping("/about")
  public String about() {
    return "Its all about Swimming.";
  }
}
