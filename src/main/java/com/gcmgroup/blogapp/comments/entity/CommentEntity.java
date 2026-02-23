package com.gcmgroup.blogapp.comments.entity;

import com.gcmgroup.blogapp.articles.entity.ArticleEntity;
import com.gcmgroup.blogapp.users.entity.UserEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.lang.Nullable;

import java.util.Date;

@Entity(name = "Comments")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long commentId;

    @Nullable
    private String commentTitle;

    @NonNull
    @Column(nullable = false)
    private String commentBody;

    @CreatedDate
    @Column(nullable = false)
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "articleId", nullable = false)
    private ArticleEntity article;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private UserEntity user;

}
