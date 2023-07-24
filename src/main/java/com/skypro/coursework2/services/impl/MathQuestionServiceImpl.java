package com.skypro.coursework2.services.impl;

import com.skypro.coursework2.model.Question;
import com.skypro.coursework2.repository.MathQuestionRepository;
import com.skypro.coursework2.services.api.QuestionService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Qualifier("mathImplementation")
public class MathQuestionServiceImpl implements QuestionService {
    private final MathQuestionRepository mathQuestionRepository;

    public MathQuestionServiceImpl(MathQuestionRepository mathQuestionRepository) {
        this.mathQuestionRepository = mathQuestionRepository;

    }

    @Override
    public Question add(Question question) {
        mathQuestionRepository.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        mathQuestionRepository.remove(question);
        return question;
    }

    @Override
    public Set<Question> getAll() {
        return mathQuestionRepository.getAll();
    }


}
