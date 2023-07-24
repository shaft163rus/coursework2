package com.skypro.coursework2.services.api;

import com.skypro.coursework2.model.Question;

import java.util.Map;
import java.util.Set;

public interface QuestionService {
    Question add(Question question);

    Question remove(Question question);

    Set<Question> getAll();



}
