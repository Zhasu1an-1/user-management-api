package com.zhasulan.usermanagement;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationError(MethodArgumentNotValidException exception){
        Map<String, String> errors = new HashMap<>();
        for (var i : exception.getBindingResult().getFieldErrors()){
            String field = i.getField();
            String error = i.getDefaultMessage();

            errors.put(field, error);
        }
        return errors;
    }
}
