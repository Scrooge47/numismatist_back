package com.example.crud.utils;

import com.example.crud.config.CoinsServiceConfig;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;

@Component
public class Settings {
    private static CoinsServiceConfig config;

    public static DateTimeFormatter getDefaultDateTimeFormatter() {
        return DateTimeFormatter.ofPattern(config.defaultDateFormat());
    }
}
