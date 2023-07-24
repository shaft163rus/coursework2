package com.skypro.coursework2.components;

import com.skypro.coursework2.model.Question;
import com.skypro.coursework2.repository.MathQuestionRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MathQuestionsInitializer {
    private final MathQuestionRepository mathQuestionRepository;

    public MathQuestionsInitializer(MathQuestionRepository mathQuestionRepository) {
        this.mathQuestionRepository = mathQuestionRepository;
    }

    @PostConstruct
    public void initializeMathQuestions(){
        Question m1 = new Question("m1","m2");
        Question m2 = new Question("m2","m3");
        Question m3 = new Question("m3","m4");
        Question m4 = new Question("m5","m6");
        Question m5 = new Question("m7","m8");
        Question m6 = new Question("m9","m10");
        Question m7 = new Question("m11","m12");

        mathQuestionRepository.add(m1);
        mathQuestionRepository.add(m2);
        mathQuestionRepository.add(m3);
        mathQuestionRepository.add(m4);
        mathQuestionRepository.add(m5);
        mathQuestionRepository.add(m6);
        mathQuestionRepository.add(m7);



    }


}
