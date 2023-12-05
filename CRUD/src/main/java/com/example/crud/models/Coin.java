package com.example.crud.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Currency;
import java.util.List;

/**
 * Represents a coin entity in the application. A coin is a piece of currency that is typically minted by a country.
 *
 * @Author Konstantin Kokoshnikov
 * @Date 19.11.2023
 * @Version 1.0
 */
@Data
@Entity
public class Coin {

    /**
     * The unique identifier for the coin.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coin_id")
    private Long id;

    /**
     * The name of the coin.
     */
    private String name;

    /**
     * A detailed description of the coin, providing additional information.
     */
    private String description;

    /**
     * The year when the coin was minted, providing historical context.
     */
    @Column(name = "coin_year")
    private Short year;

    /**
     * The face value of the coin, representing its nominal worth.
     */
    private Float nominal;

    /**
     * The number of copies of the coin in circulation.
     */
    private Integer circulation;

    /**
     * The currency associated with the coin, indicating its monetary unit.
     */
    private Currency currency;

    /**
     * The country where the coin was minted. See {@link Country}.
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id")
    @ToString.Exclude
    private Country country;

    /**
     * The material composition of the coin. See {@link Material}.
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "material_id")
    @ToString.Exclude
    private Material material;

    /**
     * The minting facility responsible for producing the coin. See {@link Mint}.
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mint_id")
    @ToString.Exclude
    private Mint mint;

    /**
     * The collections that include this coin. See {@link Collection}.
     */
    @ManyToMany
    @JsonIgnore
    @JoinTable(
        name = "coin_collection",
        joinColumns = @JoinColumn(name = "coin_id"),
        inverseJoinColumns = @JoinColumn(name = "collection_id"))
    @ToString.Exclude
    private List<Collection> collections;

    /**
     * The list of prices associated with this coin. See {@link Price}.
     */
    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "price_id")
    @ToString.Exclude
    private List<Price> prices;
}
/**
 * See Also: - {@link Country} (Country Entity): The country where the coin was minted. - {@link Material} (Material
 * Entity): The material composition of the coin. - {@link Mint} (Mint Entity): The minting facility responsible for
 * producing the coin. - {@link Collection} (Collection Entity): The collections that include this coin. - {@link Price}
 * (Price Entity): The list of prices associated with this coin.
 */
