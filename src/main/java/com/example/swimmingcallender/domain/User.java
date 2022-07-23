package com.example.swimmingcallender.domain;

import lombok.Builder;
import lombok.Data;

/**
 * User Data Transfer Object.
 *
 * @author kshitijbaluni
 * @since 23 July 2022
 */
@Data
@Builder
public class User {
  private int id;
  private String firstName;
  private String lastName;
  private String email;
}
