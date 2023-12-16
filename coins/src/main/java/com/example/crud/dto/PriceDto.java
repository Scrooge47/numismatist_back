package com.example.crud.dto;

import com.example.crud.models.Coin;
import com.example.crud.models.Condition;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PriceDto {
    @NotNull
    private Condition condition;

    @NotNull
    @Positive
    private Float price;

    @NotNull
    private Coin coin;
}
