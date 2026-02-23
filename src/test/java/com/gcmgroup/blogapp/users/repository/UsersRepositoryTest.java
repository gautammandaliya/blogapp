package com.gcmgroup.blogapp.users.repository;

import com.gcmgroup.blogapp.users.entity.UserEntity;
import com.gcmgroup.blogapp.users.repository.UsersRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest; 
import org.springframework.test.context.ActiveProfiles;

@DataJpaTest
@ActiveProfiles("test")
public class UsersRepositoryTest {

    @Autowired
    private UsersRepository usersRepository;

    @Test
    void can_create_user() {
        var user = UserEntity.builder()
                .userName("gautam_mandaliya")
                .userEmail("gautamman2906@gmail.com")
                .build();

        userRepository.save(user);
    }

}