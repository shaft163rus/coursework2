package com.skypro.coursework2.services.impl;

import com.skypro.coursework2.model.Question;
import com.skypro.coursework2.services.api.QuestionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service

public class JavaQuestionServiceImpl implements QuestionService {
    private Question question;
    public HashMap<String, String> questions = new HashMap<>();

    @Override
    public String add(String question, String answer) {
        questions.put(question, question);

        return question;
    }



    @Override
    public Question remove(Question question) {
        questions.remove(question.getQuestion());

        return question;
    }

    @Override
    public Map<String, String> getAll() {
        return null;
    }

    @Override
    public Question getRandomQuestion() {

        Map.Entry<String, String> randomValue = getRandomEntryFromMap(questions);
        question.setQuestion(randomValue.getKey());
        question.setAnswer(randomValue.getValue());

        return question;
    }

    public static <K, V> Map.Entry<K, V> getRandomEntryFromMap(Map<K, V> map) {
        int randomIndex = new Random().nextInt(map.size());
        K randomKey = map.keySet().stream().skip(randomIndex).findFirst().orElse(null);
        if (randomKey != null) {
            V randomValue = map.get(randomKey);
            return new HashMap.SimpleEntry<>(randomKey, randomValue);
        } else {
            return null;
        }
    }
}
