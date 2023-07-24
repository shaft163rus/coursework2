package com.skypro.coursework2.services.api;

import com.skypro.coursework2.model.Question;

import java.util.HashMap;

public interface ExaminerService {
    HashMap<String, String> getQuestions(int amount);

}
