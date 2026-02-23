package com.gcmgroup.blogapp.users.entity;

import org.springframework.lang.Nullable;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Users")
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@RequiredArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    @NonNull
    private String userName;

    @Column(nullable = false)
    @NonNull
    private String userEmail;

    @Nullable
    private String userBio;

    @Nullable
    private String userImage;

}
