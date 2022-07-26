package com.example.swimmingcalendar.repository;

import com.example.swimmingcalendar.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
