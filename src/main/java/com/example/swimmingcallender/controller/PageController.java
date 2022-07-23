package com.example.swimmingcallender.controller;

import com.example.swimmingcallender.domain.User;
import com.example.swimmingcallender.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
  private NotificationService notificationService;
  @Value("${pagecontroller.msg}")
  private String propertiesMsg;

  @Autowired
  public PageController(NotificationService notificationService) {
    this.notificationService = notificationService;
  }

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

  @RequestMapping("/notification")
  public String notification() {
    return notificationService.toString();
  }

  @RequestMapping("/properties")
  public String properties() {
    return propertiesMsg;
  }
}
