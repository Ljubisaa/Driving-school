package com.drivingschool.service;

import java.util.Set;

import com.drivingschool.model.driving.Question;
import com.drivingschool.model.driving.Quiz;

public interface QuestionService {

	public Question addQuestion(Question question);
	
	public Question updateQuestion(Question question);
	
	public Set<Question> getQuestions();
	
	public Question getQuestion(Long questionId);
	
	public void deleteQuestion(Long questionId);
	
	public Set<Question> getQuestionsOfQuizzess(Quiz quiz);
}
