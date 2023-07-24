package com.skypro.coursework2.services.impl;

import com.skypro.coursework2.exceptions.InvalidQuestionAmountException;
import com.skypro.coursework2.model.Question;
import com.skypro.coursework2.repository.QuestionRepository;
import com.skypro.coursework2.services.api.ExaminerService;
import com.skypro.coursework2.services.api.QuestionService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@Service

public class ExaminerServiceImpl implements ExaminerService {

    private final List<QuestionRepository> javaAndMathQuestions;


    public ExaminerServiceImpl(@Qualifier("javaRepo") QuestionRepository javaQuestionsRepository, @Qualifier("mathRepo") QuestionRepository mathQuestionsRepository) {
        this.javaAndMathQuestions = Arrays.asList(javaQuestionsRepository, mathQuestionsRepository);


    }


    @Override
    public List<Question> getRandomMathAndJavaQuestions(int amount) {

        List<Question> result = new ArrayList<>(javaAndMathQuestions.get(0).getAll());
        result.addAll(javaAndMathQuestions.get(1).getAll());
        Collections.shuffle(result);

        if (result.size() < amount) {
            throw new InvalidQuestionAmountException("The number of questions is too large");
        }

        return result.subList(0, amount);
    }


}
