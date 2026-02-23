package com.gcmgroup.blogapp.articles.repository;

import com.gcmgroup.blogapp.articles.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<ArticleEntity, Long> {
}
