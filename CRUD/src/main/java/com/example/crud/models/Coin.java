package com.example.crud.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Currency;
import java.util.List;

@Data
@Entity
public class Coin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coin_id")
    private Long id;
    private String name;
    private String description;
    @Column(name = "coin_year")
    private Short year;
    private Float nominal;
    private Integer circulation;
    private Currency currency;

}
