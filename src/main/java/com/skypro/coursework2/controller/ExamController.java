package com.skypro.coursework2.controller;

import com.skypro.coursework2.model.Question;
import com.skypro.coursework2.services.api.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController

public class ExamController {
    private final ExaminerService examService;

    public ExamController(ExaminerService examService) {
        this.examService = examService;
    }
    @GetMapping(path = "/exam/java/{amount}")
    public Set<Question> getQuestions(@PathVariable int amount) {

        return  examService.getQuestions(amount);
    }
}
