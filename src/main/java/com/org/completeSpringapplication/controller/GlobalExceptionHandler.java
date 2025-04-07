package com.org.completeSpringapplication.controller;
import com.org.completeSpringapplication.Exception.ProductNotFoundException;
import com.org.completeSpringapplication.Utility.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.time.LocalDateTime;

@RestControllerAdvice
//@ControllerAdvice @ResponseBody
public class GlobalExceptionHandler
{
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorMessage> handlerProductNotFoundException(Exception e)
    {
        return new ResponseEntity<>(new ErrorMessage(LocalDateTime.now(),e.getMessage(),""), HttpStatus.NOT_FOUND);
    }
}
