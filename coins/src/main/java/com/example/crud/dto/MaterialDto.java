package com.example.crud.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MaterialDto {

    private Long id;

    @NotBlank
    @Size(max = 255)
    private String type;
}
