package com.drivingschool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drivingschool.entity.Quiz;
import com.drivingschool.service.QuizService;

@RestController
@RequestMapping("/quiz")
@CrossOrigin("*")
public class QuizController {

	@Autowired
	private QuizService quizService;

	@PostMapping("/")
	public ResponseEntity<Quiz> addQuiz(@RequestBody Quiz quiz) {
		return ResponseEntity.ok(this.quizService.addQuiz(quiz));
	}

	@PutMapping("/")
	public ResponseEntity<Quiz> updateQuiz(@RequestBody Quiz quiz) {
		return ResponseEntity.ok(this.quizService.updateQuiz(quiz));
	}

	@GetMapping("/")
	public ResponseEntity<?> quizzess() {

		return ResponseEntity.ok(this.quizService.getQuizzess());
	}

	@GetMapping("/{quizId}")
	public Quiz quiz(@PathVariable("quizId") Long quizId) {

		return this.quizService.getQuiz(quizId);
	}

	@DeleteMapping("/{quizId}")
	public void delete(@PathVariable("quizId") Long quizId) {
		this.quizService.deleteQuiz(quizId);
	}

}
