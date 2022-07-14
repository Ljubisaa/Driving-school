package com.drivingschool.repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drivingschool.model.driving.Question;
import com.drivingschool.model.driving.Quiz;

public interface QuestionRepository extends JpaRepository<Question, Long> {

	Set<Question> findByQuiz(Quiz quiz);

}
