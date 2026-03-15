package com.example.taskmanager.repository;

import com.example.taskmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);

    List<User> findByRole(String role);
}