package com.skypro.coursework2.repository;
import com.skypro.coursework2.model.Question;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import java.util.HashSet;
import java.util.Set;

@Repository
@Qualifier("mathRepo")
public class MathQuestionRepository implements QuestionRepository {

    private final Set<Question> mathQuestions = new HashSet<>();

    @Override
    public Question add(Question question) {

        mathQuestions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        mathQuestions.remove(question);
        return question;
    }

    @Override
    public Set<Question> getAll() {
        return mathQuestions;
    }
}
