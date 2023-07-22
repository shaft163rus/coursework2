package com.skypro.coursework2.services.impl;

import com.skypro.coursework2.model.Question;
import com.skypro.coursework2.services.api.QuestionService;
import org.springframework.stereotype.Service;

@Service

public class JavaQuestionService implements QuestionService {
    @Override
    public Question add(String question, String answer) {
        return null;
    }

    @Override
    public Question add(Question question) {
        return null;
    }

    @Override
    public Question remove(Question question) {
        return null;
    }

    @Override
    public Question getRandomQuestion() {
        return null;
    }
}
