package com.drivingschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drivingschool.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
