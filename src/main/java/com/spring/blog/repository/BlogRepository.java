package com.spring.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.blog.model.Post;

@Repository
public interface BlogRepository extends JpaRepository<Post, Long> {
	
}
