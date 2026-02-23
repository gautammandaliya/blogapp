package com.gcmgroup.blogapp.articles.repository;

import com.gcmgroup.blogapp.articles.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<ArticleEntity, Long> {
}
