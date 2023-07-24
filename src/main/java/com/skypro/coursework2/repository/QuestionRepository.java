package com.skypro.coursework2.repository;

import com.skypro.coursework2.model.Question;

import java.util.Set;

public interface QuestionRepository {
    Question add(Question question);

    Question remove(Question question);

    Set<Question> getAll();
}
