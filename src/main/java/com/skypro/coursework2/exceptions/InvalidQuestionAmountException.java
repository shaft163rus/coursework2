package com.skypro.coursework2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public class InvalidQuestionAmountException extends RuntimeException {
    public InvalidQuestionAmountException(String message) {
        super(message);
    }
}
