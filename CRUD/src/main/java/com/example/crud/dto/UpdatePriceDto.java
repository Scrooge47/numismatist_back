package com.example.crud.dto;


import com.example.crud.models.Condition;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdatePriceDto {

    private Condition condition;

    private Float price;
}
