package com.example.shop.handlersException;

import com.example.shop.exceptions.laptopException.LaptopNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class LaptopHandlersException {
    @ExceptionHandler(LaptopNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String laptopNotFoundHandler(LaptopNotFoundException ex) {
        return ex.getMessage();
    }
}
