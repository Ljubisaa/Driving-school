package com.drivingschool.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drivingschool.model.driving.Question;
import com.drivingschool.model.driving.Quiz;
import com.drivingschool.repo.QuestionRepository;
import com.drivingschool.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionRepository questionRepo;

	@Override
	public Question addQuestion(Question question) {

		return this.questionRepo.save(question);
	}

	@Override
	public Question updateQuestion(Question question) {

		return this.questionRepo.save(question);
	}

	@Override
	public Set<Question> getQuestions() {

		return new HashSet<>(this.questionRepo.findAll());
	}

	@Override
	public Question getQuestion(Long questionId) {
		return this.questionRepo.findById(questionId).get();
	}

	@Override
	public void deleteQuestion(Long questionId) {

		Question question = new Question();
		question.setQuesId(questionId);

		this.questionRepo.delete(question);
	}

	@Override
	public Set<Question> getQuestionsOfQuizzess(Quiz quiz) {

		return this.questionRepo.findByQuiz(quiz);
	}

}
