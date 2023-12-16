package com.example.crud.dto;

import com.example.crud.utils.Settings;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
public class Error {

    private String reason;

    private String message;

    private HttpStatus status;

    private String timestamp;

    public Error(String reason, String message, HttpStatus status, LocalDateTime date) {
        this.reason = reason;
        this.message = message;
        this.status = status;
        this.timestamp = Settings.getDefaultDateTimeFormatter().format(date);
    }
}
