package com.gcmgroup.blogapp.articles.entity;

import com.gcmgroup.blogapp.users.entity.UserEntity;
import org.springframework.lang.Nullable;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity(name = "Articles")
@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@RequiredArgsConstructor
public class ArticleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long articleId;

    @NonNull
    @Column(nullable = false)
    private String articleTitle;

    @Nullable
    private String articleSubTitle;

    @NonNull
    @Column(unique = true,  nullable = false)
    private String articleSlug;

    @NonNull
    @Column(nullable = false)
    private String articleBody;

    @CreatedDate
    @Column(nullable = false)
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private UserEntity user;

    // TODO: add tags entity

}