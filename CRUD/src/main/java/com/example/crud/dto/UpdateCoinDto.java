package com.example.crud.dto;


import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Currency;

@Getter
@Setter
public class UpdateCoinDto {

    @Size(max = 255)
    private String name;

    private String description;

    private Short year;

    private Float nominal;

    private Integer circulation;

    private Currency currency;

    private Long countyId;

    private Long mintId;

    private Long materialId;
}
