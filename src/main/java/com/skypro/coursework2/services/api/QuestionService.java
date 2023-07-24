package com.skypro.coursework2.services.api;

import com.skypro.coursework2.model.Question;

import java.util.Map;

public interface QuestionService {
    String add(String question, String answer);



    Question remove(Question question);

    Map<String, String> getAll();

    Question getRandomQuestion();


}
