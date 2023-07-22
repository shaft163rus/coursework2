package com.skypro.coursework2.services.api;

import com.skypro.coursework2.model.Question;

public interface QuestionService {
    Question add(String question, String answer);

    Question add(Question question);

    Question remove(Question question);

  //  Coolection<Question> getAll();

    Question getRandomQuestion();


}
