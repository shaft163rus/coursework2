package com.skypro.coursework2.services.impl;

import com.skypro.coursework2.exceptions.InvalidQuestionAmountException;
import com.skypro.coursework2.model.Question;
import com.skypro.coursework2.services.api.ExaminerService;
import com.skypro.coursework2.services.api.QuestionService;
import org.springframework.stereotype.Service;


import java.util.HashSet;
import java.util.Set;

@Service

public class ExaminerServiceImpl implements ExaminerService {
    private final Set<Question> examQuestions = new HashSet<>();
    private final QuestionService javaQuestionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.javaQuestionService = questionService;
    }


    @Override
    public Set<Question> getQuestions(int amount) {

        if (javaQuestionService.getAll().size() < amount) {
            throw new InvalidQuestionAmountException("Invalid amount");
        }

        while (examQuestions.size() <= amount) {
            examQuestions.add(javaQuestionService.getRandomQuestion());
        }

        return examQuestions;
    }
}
