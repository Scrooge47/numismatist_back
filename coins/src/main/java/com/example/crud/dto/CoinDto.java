package com.example.crud.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Currency;
import java.util.List;

@Getter
@Setter
public class CoinDto {

    private Long id;

    @NotBlank
    @Size(max = 255)
    private String name;

    @NotBlank
    private String description;

    @NotNull
    private Short year;

    @NotNull
    private Float nominal;

    @NotNull
    private Integer circulation;

    @NotNull
    private Currency currency;

    @NotNull
    private CountryDto county;

    @NotNull
    private MintDto mint;

    @NotNull
    private MaterialDto material;

    private List<PriceDto> prices;
}
