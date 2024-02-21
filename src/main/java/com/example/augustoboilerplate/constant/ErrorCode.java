package com.example.augustoboilerplate.constant;

import lombok.Getter;

/**
 * Pattern
 * module-sequential
 * example: GB_0001
 */

@Getter
public enum ErrorCode {

    GAME_BACKLOG_NOT_FOUND("GB_0001", "Game backlog not found")
    ;

    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
