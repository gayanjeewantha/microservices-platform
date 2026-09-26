package com.gayan.platform.userservice.repository;

import com.gayan.platform.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
