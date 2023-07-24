package com.skypro.coursework2.controller;

import com.skypro.coursework2.model.Question;

import com.skypro.coursework2.services.api.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController

@RequestMapping("/exam/java")
public class JavaQuestionController {


    private final QuestionService questionService;

    @Autowired
    public JavaQuestionController(@Qualifier("javaImplementation") QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping(path = "/add")
    public Question add(@RequestParam("question") String question,
                        @RequestParam("answer") String answer) {
        Question currentQuestion = new Question(question, answer);
        questionService.add(currentQuestion);
        return currentQuestion;
    }

    @GetMapping(path = "/remove")
    public Question remove(@RequestParam("question") String question,
                           @RequestParam("answer") String answer) {
        Question currentQuestion = new Question(question, answer);
        questionService.remove(currentQuestion);
        return currentQuestion;
    }

    @GetMapping(path = "/getAll")
    public String getAll() {
        return questionService.getAll().toString();
    }


}
