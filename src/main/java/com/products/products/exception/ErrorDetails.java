package com.products.products.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class ErrorDetails {

    private HttpStatus status;
    private String message;
    private List<String> errors;

    public ErrorDetails(HttpStatus status, String message, List<String> errors) {
        super();
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public ErrorDetails(HttpStatus status, String message, String error) {
        super();
        this.status = status;
        this.message = message;
        errors = Arrays.asList(error);
    }
}
