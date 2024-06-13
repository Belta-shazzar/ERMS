package com.shazzar.erms.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ErrorMessage {
    private int statusCode;
    private HttpStatus status;
    private String message;
}
