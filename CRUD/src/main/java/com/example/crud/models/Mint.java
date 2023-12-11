package com.example.crud.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Represents a mint entity in the application. A mint is responsible for producing coins.
 *
 * @Author Konstantin Kokoshnikov
 * @Date 19.11.2023
 * @Version 1.0
 */
@Data
@Entity
public class Mint {

    /**
     * The unique identifier for the mint.
     */
    @Id
    @Column(name = "mint_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The name of the mint.
     */
    private String name;

    /**
     * The list of coins associated with this mint.
     * <p>
     * This is a one-to-many relationship, and the association is unidirectional. It is mapped by the "mint" property in
     * the Coin class.
     */
    @OneToMany
    @JsonIgnore
    @JoinColumn(name = "coin_id")
    @ToString.Exclude
    private List<Coin> coins;

    /**
     * The country associated with the mint. See {@link Country}.
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id")
    @ToString.Exclude
    private Country country;
}