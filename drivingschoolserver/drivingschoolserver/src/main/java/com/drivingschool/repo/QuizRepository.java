package com.drivingschool.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drivingschool.model.driving.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
