package com.example.crud.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Represents a country entity in the application. A country is associated with coins and mints.
 *
 * @Author Konstantin Kokoshnikov
 * @Date 19.11.2023
 * @Version 1.0
 *
*/
@Data
@Entity
@NoArgsConstructor
public class Country {
    /**
     * The unique identifier for the country.
     */
    @Id
    @Column(name = "country_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The name of the country.
     */
    private String name;

    /**
     * The country code.
     */
    private String code;

    public Country(Long id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    /**
     * The list of coins associated with this country.
     * <p>
     * This is a one-to-many relationship, and the association is unidirectional.
     * It is mapped by the "country" property in the Coin class.
     */
    @OneToMany
    @JsonIgnore
    @JoinColumn(name = "coin_id")
    @ToString.Exclude
    private List<Coin> coins;

    /**
     * The list of mints associated with this country.
     * <p>
     * This is a one-to-many relationship, and the association is unidirectional.
     * It is mapped by the "country" property in the Mint class.
     */
    @OneToMany
    @JsonIgnore
    @JoinColumn(name = "mint_id")
    @ToString.Exclude
    private List<Mint> mints;
}
/** See Also:
 * - {@link Coin} (Coin Entity): Represents a coin entity in the application.
 * - {@link Mint} (Mint Entity): Represents a mint entity in the application.
 */
