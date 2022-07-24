package com.drivingschool.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drivingschool.entity.Question;
import com.drivingschool.entity.Quiz;

public interface QuestionRepository extends JpaRepository<Question, Long> {

	Set<Question> findByQuiz(Quiz quiz);

}
