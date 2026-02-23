package com.gcmgroup.blogapp.comments.repository;

import com.gcmgroup.blogapp.comments.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
}
