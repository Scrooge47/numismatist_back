package com.example.crud.dto;


import com.example.crud.models.Condition;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewPriceDto {

    @NotNull
    private Condition condition;

    @NotNull
    @Positive
    private Float price;
}
