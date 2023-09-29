package com.test.test.interfa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test.entity.User;

public interface UserInterface extends JpaRepository<User, Integer> {
}
