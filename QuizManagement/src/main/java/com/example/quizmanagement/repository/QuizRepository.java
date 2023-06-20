package com.example.quizmanagement.repository;

import com.example.quizmanagement.model.question.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
