package com.example.crud.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationProperties("coins")
@ConfigurationPropertiesScan
public record CoinsServiceConfig(String defaultDateFormat) {
}
