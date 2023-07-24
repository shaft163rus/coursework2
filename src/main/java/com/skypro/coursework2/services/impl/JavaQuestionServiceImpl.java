package com.skypro.coursework2.services.impl;

import com.skypro.coursework2.model.Question;
import com.skypro.coursework2.services.api.QuestionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service

public class JavaQuestionServiceImpl implements QuestionService {

    private final Set<Question> questions = new HashSet<>();


    @Override
    public String add(String question, String answer) {
        Question thisQuestion = new Question(question, answer);
        questions.add(thisQuestion);

        return thisQuestion.toString();
    }


    @Override
    public Question remove(Question question) {
        questions.remove(question);

        return question;
    }

    @Override
    public Set<Question> getAll() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
        return getRandomElementFromSet(questions);
    }

    public static <T> T getRandomElementFromSet(Set<T> set) {
        int randomIndex = new Random().nextInt(set.size());
        T[] array = (T[]) set.toArray();
        return array[randomIndex];
    }


}
