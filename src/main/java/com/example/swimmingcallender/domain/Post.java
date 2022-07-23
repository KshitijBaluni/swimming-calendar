package com.example.swimmingcallender.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * Post Data transfer Object.
 *
 * @author kshitijbaluni
 * @since 23 July 2022
 */
@Data
@Builder
public class Post {
  private long postId;
  private String postName;
  private String postDescription;
  private String postAuthor;
  private Date createAt;
}
