package com.zirius.zerp.configuration;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.zirius.zerp.movies.util.ErrorDetails;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {

	private final static String VALIDATION_FAILED = "Validation Failed";
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status, WebRequest request) {
    	
    	ErrorDetails errorDetails = new ErrorDetails(new Date(), VALIDATION_FAILED,
                ex.getBindingResult().getFieldError().getDefaultMessage());
            return new ResponseEntity<>(errorDetails, headers, HttpStatus.BAD_REQUEST);

    }

}