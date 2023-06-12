package com.example.shop.handlersException;

import com.example.shop.exceptions.computerException.ComputerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ComputerHandlersException {
    @ExceptionHandler(ComputerNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String computerNotFoundHandler(ComputerNotFoundException ex) {
        return ex.getMessage();
    }
}
