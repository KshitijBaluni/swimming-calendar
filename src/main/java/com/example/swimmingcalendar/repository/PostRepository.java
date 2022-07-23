package com.example.swimmingcalendar.repository;

import com.example.swimmingcalendar.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
