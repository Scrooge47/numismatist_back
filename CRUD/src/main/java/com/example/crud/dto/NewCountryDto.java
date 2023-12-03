package com.example.crud.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewCountryDto {

    @NotBlank
    @Size(min = 3, max = 255)
    private String name;

}
