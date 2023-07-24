package com.skypro.coursework2.services.impl;

import com.skypro.coursework2.exceptions.InvalidQuestionAmountException;
import com.skypro.coursework2.services.api.ExaminerService;
import com.skypro.coursework2.services.api.QuestionService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service

public class ExaminerServiceImpl implements ExaminerService {
    private final HashMap<String,String> randomQuestions = new HashMap<>();
    private final QuestionService javaQuestionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.javaQuestionService = questionService;
    }


    @Override
    public HashMap<String, String> getQuestions(int amount) {



        for (int i = 0; i <= amount; i++) {
            randomQuestions.put(javaQuestionService.getRandomQuestion().getQuestion(), javaQuestionService.getRandomQuestion().getAnswer());
            if (randomQuestions.size() > amount) {
                throw new InvalidQuestionAmountException("Invalid amount");
            }
        }

        return randomQuestions;
    }
}
