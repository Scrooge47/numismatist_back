package com.example.crud.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Data
@Entity
public class Country {
    @Id
    @Column(name = "country_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    @OneToMany
    @JsonIgnore
    @JoinColumn(name = "coin_id")
    private List<Coin> coins;

    @OneToMany
    @JsonIgnore
    @JoinColumn(name = "mint_id")
    private List<Mint> mints;
}
