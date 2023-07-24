package com.skypro.coursework2.controller;

import com.skypro.coursework2.services.api.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController

public class ExamController {
    private final ExaminerService examService;

    public ExamController(ExaminerService examService) {
        this.examService = examService;
    }
    @GetMapping(path = "/exam/java/{amount}")
    public HashMap<String, String> getQuestions(@PathVariable int amount) {
        examService.getQuestions(amount);
        return null;
    }
}
