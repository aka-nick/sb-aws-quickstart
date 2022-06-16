package com.akanick.saq.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// DB계층 접근자
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
