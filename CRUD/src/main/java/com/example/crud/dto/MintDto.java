package com.example.crud.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MintDto {

    private Long id;

    @NotBlank
    @Size(max = 255)
    private String name;

    @NotNull
    private CountryDto country;

}
