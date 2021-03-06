package com.practice.springframework.core.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.List;
@Getter
public class Result {

    private final int status;
    private final String message;


    public Result(HttpStatus status, String message) {
        this.status = status.value();
        this.message = message;
    }


}
