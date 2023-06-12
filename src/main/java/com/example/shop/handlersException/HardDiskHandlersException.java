package com.example.shop.handlersException;

import com.example.shop.exceptions.hardDiskException.HardDiskNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HardDiskHandlersException {

    @ExceptionHandler(HardDiskNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String hardDiskNotFoundHandler(HardDiskNotFoundException ex) {
        return ex.getMessage();
    }
}
