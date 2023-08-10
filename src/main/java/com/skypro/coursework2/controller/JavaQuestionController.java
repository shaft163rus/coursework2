package com.skypro.coursework2.controller;

import com.skypro.coursework2.model.Question;
import com.skypro.coursework2.services.impl.JavaQuestionServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {

    public JavaQuestionServiceImpl javaQuestionServiceImpl;

    public JavaQuestionController(JavaQuestionServiceImpl javaQuestionServiceImpl) {
        this.javaQuestionServiceImpl = javaQuestionServiceImpl;

    }

    @GetMapping(path = "/add")
    public String add(@RequestParam("question") String question,
                      @RequestParam("answer") String answer){
        javaQuestionServiceImpl.add(question, answer);

        return question;
    }

    @GetMapping(path = "/remove")
    public String remove(@RequestParam("question") String question,
                      @RequestParam("answer") String answer){
        Question thisQuestion = new Question(question, answer);
       javaQuestionServiceImpl.remove(thisQuestion);
        return thisQuestion.toString();
    }

    @GetMapping(path = "/getAll")
    public String getAll(){

        return javaQuestionServiceImpl.getAll().toString();
    }


}
