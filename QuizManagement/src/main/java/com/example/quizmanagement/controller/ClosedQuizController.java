package com.example.quizmanagement.controller;

import com.example.quizmanagement.model.question.Quiz;
import com.example.quizmanagement.service.QuizManagementService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/quiz")
public class ClosedQuizController {
    private QuizManagementService quizManagementService;

    @PostMapping
    public ResponseEntity<Quiz> createBoardGame(@Valid @RequestBody Quiz quiz){
        return new ResponseEntity<>(quizManagementService.save(quiz), HttpStatus.CREATED);
    }


}
