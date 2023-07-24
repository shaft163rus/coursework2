package com.skypro.coursework2.services.api;

import com.skypro.coursework2.model.Question;

import java.util.HashMap;
import java.util.Set;

public interface ExaminerService {
    Set<Question> getQuestions(int amount);

}
