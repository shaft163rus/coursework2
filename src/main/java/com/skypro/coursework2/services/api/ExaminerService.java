package com.skypro.coursework2.services.api;

import com.skypro.coursework2.model.Question;
import com.skypro.coursework2.repository.QuestionRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public interface ExaminerService {
    List<Question> getRandomMathAndJavaQuestions(int amount);

}
