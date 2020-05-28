package com.zirius.zerp.movieApi.Controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.zirius.zerp.movieApi.Entities.CustomException;
import com.zirius.zerp.movieApi.Entities.CustomExceptionSchema;

@ControllerAdvice
public class ValidationController extends ResponseEntityExceptionHandler {

  @ExceptionHandler(CustomException.class)
  public final ResponseEntity<Object> handleAllExceptions(CustomException ex) {
    CustomExceptionSchema exceptionResponse =
        new CustomExceptionSchema(
            ex.getMessage(), ex.getDetails(), ex.getHint());
    return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}