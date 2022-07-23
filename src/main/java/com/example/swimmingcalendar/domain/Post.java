package com.example.swimmingcalendar.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Post Data transfer Object.
 *
 * @author kshitijbaluni
 * @since 23 July 2022
 */
@Builder
@AllArgsConstructor
@Data
@Entity
public class Post {
  @Id
  @GeneratedValue
  private long postId;
  @Column(columnDefinition = "TEXT")
  private String postName;
  @Column(columnDefinition = "TEXT")
  private String postDescription;
  @Column(columnDefinition = "TEXT")
  private String postAuthor;
  @CreationTimestamp
  private Date createAt;

  @SuppressWarnings(value = "Unused")
  public Post() {
  }
}
