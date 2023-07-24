package com.skypro.coursework2.services.impl;

import com.skypro.coursework2.model.Question;
import com.skypro.coursework2.repository.JavaQuestionRepository;
import com.skypro.coursework2.services.api.QuestionService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Qualifier("javaImplementation")
public class JavaQuestionServiceImpl implements QuestionService {

    private final JavaQuestionRepository javaQuestionRepository;

    public JavaQuestionServiceImpl(JavaQuestionRepository javaQuestionRepository) {
        this.javaQuestionRepository = javaQuestionRepository;
    }


    @Override
    public Question add(Question question) {
        javaQuestionRepository.add(question);
        return question;
    }


    @Override
    public Question remove(Question question) {
        javaQuestionRepository.remove(question);

        return question;
    }

    @Override
    public Set<Question> getAll() {
        return javaQuestionRepository.getAll();
    }




}
