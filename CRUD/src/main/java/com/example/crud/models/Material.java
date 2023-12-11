package com.example.crud.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Represents a material entity in the application. A material is associated with coins.
 *
 * @Author Konstantin Kokoshnikov
 * @Date 19.11.2023
 * @Version 1.0
 */
@Data
@Entity
public class Material {

    /**
     * The unique identifier for the material.
     */
    @Id
    @Column(name = "material_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The type of material.
     */
    private String type;

    /**
     * The list of coins associated with this material.
     * <p>
     * This is a one-to-many relationship, and the association is unidirectional. It is mapped by the "material"
     * property in the Coin class.
     */
    @OneToMany
    @JsonIgnore
    @JoinColumn(name = "coin_id")
    @ToString.Exclude
    private List<Coin> coins;
}
