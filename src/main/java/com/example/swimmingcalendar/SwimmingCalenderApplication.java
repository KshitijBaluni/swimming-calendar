package com.example.swimmingcalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Main Application
 *
 * @author kshitijbaluni
 * @since 23 July 2022
 */
@SpringBootApplication
public class SwimmingCalenderApplication {

  public static void main(String[] args) {
    SpringApplication.run(SwimmingCalenderApplication.class, args);
  }

}
