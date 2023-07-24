package com.skypro.coursework2.components;

import com.skypro.coursework2.model.Question;
import com.skypro.coursework2.repository.JavaQuestionRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class JavaQuestionsInitializer {

    private final JavaQuestionRepository javaQuestionRepository;
    public JavaQuestionsInitializer(JavaQuestionRepository javaQuestionRepository) {
        this.javaQuestionRepository = javaQuestionRepository;
    }

    @PostConstruct
    public void initializeJavaQuestions(){
        Question q1 = new Question("1","2");
        Question q2 = new Question("2","3");
        Question q3 = new Question("3","4");
        Question q4 = new Question("5","6");
        Question q5 = new Question("7","8");
        Question q6 = new Question("9","10");
        Question q7 = new Question("11","12");

        javaQuestionRepository.add(q1);
        javaQuestionRepository.add(q2);
        javaQuestionRepository.add(q3);
        javaQuestionRepository.add(q4);
        javaQuestionRepository.add(q5);
        javaQuestionRepository.add(q6);
        javaQuestionRepository.add(q7);


    }

}
