package com.gcmgroup.blogapp.users.repository;

import com.gcmgroup.blogapp.users.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
