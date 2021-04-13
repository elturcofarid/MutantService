package com.mutant.exception.handler;

import com.mutant.exception.RestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class RestResponseExceptionHandler {

    @ExceptionHandler(RestException.class)
    protected ResponseEntity<Void> handleConflict(
            RestException ex, WebRequest request) {

        return ResponseEntity.status(ex.getStatus()).build();
    }
}