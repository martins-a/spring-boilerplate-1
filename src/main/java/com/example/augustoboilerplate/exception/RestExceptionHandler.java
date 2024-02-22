package com.example.augustoboilerplate.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice // used to handle exceptions in whole application
// Check image in doc.
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Object> handleNotFoundException(NotFoundException exception, WebRequest request) {
        ApiErrorMessage apiErrorMessage = new ApiErrorMessage(exception.getMessage(), exception.getErrorCode().getCode());
        return new ResponseEntity<>(apiErrorMessage, HttpStatus.BAD_REQUEST);
    }

}
