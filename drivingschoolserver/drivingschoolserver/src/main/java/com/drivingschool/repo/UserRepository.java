package com.drivingschool.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drivingschool.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);
}
