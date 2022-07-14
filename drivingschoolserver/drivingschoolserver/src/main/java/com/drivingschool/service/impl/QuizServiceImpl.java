package com.drivingschool.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drivingschool.model.driving.Quiz;
import com.drivingschool.repo.QuizRepository;
import com.drivingschool.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	QuizRepository quizRepo;

	@Override
	public Quiz addQuiz(Quiz quiz) {

		return this.quizRepo.save(quiz);
	}

	@Override
	public Quiz updateQuiz(Quiz quiz) {

		return this.quizRepo.save(quiz);
	}

	@Override
	public Set<Quiz> getQuizzess() {

		return new LinkedHashSet<>(this.quizRepo.findAll());
	}

	@Override
	public Quiz getQuiz(Long quizId) {

		return this.quizRepo.findById(quizId).get();
	}

	@Override
	public void deleteQuiz(Long quizId) {

		Quiz quiz = new Quiz();
		quiz.setqId(quizId);

		this.quizRepo.delete(quiz);
	}

}
