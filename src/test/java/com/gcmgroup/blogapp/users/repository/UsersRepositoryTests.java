package com.gcmgroup.blogapp.users.repository;

import com.gcmgroup.blogapp.users.entity.UserEntity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class UsersRepositoryTests {
    @Autowired
    private UsersRepository usersRepository;

    @Test
    @Order(1)
    void can_create_users() {
        var user = UserEntity.builder()
                .userName("gautam")
                .userEmail("gautam@blog.com")
                .build();

        usersRepository.save(user);

    }

    @Test
    @Order(2)
    void can_find_users() {
        var user = UserEntity.builder()
                .userName("gautam")
                .userEmail("gautam@blog.com")
                .build();

        usersRepository.save(user);
        var users = usersRepository.findAll();
        Assertions.assertEquals(1, users.size());
    }
}