package com.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class MessageDTO<T> {
    private HttpStatus status;
    private boolean success;
    private String message;
    private T data;
}
