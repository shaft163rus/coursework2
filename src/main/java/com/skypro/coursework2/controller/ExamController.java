package com.skypro.coursework2.controller;


import com.skypro.coursework2.model.Question;
import com.skypro.coursework2.repository.QuestionRepository;
import com.skypro.coursework2.services.api.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examService) {
        this.examinerService = examService;
    }
    @GetMapping(path = "/exam/{amount}")
    public List<Question> getQuestions(@PathVariable int amount) {

        return examinerService.getRandomMathAndJavaQuestions(amount);
    }
}
