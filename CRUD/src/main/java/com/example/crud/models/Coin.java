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
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id")
    private Country country;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "material_id")
    private Material material;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mint_id")
    private Mint mint;
    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "coin_collection",
            joinColumns = @JoinColumn(name = "coin_id"),
            inverseJoinColumns = @JoinColumn(name = "collection_id"))
    private List<Collection> collections;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "price_id")
    private List<Price> prices;
}
