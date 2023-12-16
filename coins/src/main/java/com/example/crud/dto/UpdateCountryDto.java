package com.example.crud.dto;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateCountryDto {
    @Size(min = 3, max = 150)
    private String name;


    @Size(min = 3, max = 3)
    private String code;
}
