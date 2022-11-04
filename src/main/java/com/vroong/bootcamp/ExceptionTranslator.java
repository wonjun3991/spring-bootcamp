package com.vroong.bootcamp;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionTranslator {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Error> handle(MethodArgumentNotValidException e) {
        final Error error = new Error(e.getMessage());
        return ResponseEntity.badRequest().body(error);
    }

    @Getter
    @Setter
    static class Error {
        String message;

        public Error(String message) {
            this.message = message;
        }
    }
}
