package com.example.augustoboilerplate.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiErrorMessage {
    private String message;
    private String errorCode;
}
