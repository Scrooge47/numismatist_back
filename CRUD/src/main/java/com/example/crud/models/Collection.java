package com.example.crud.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Represents a collection of coins in the application.
 * <p>
 * A collection is a grouping of individual coins, and it is associated with various properties and relationships.
 *
 * @Author Konstantin Kokoshnikov
 * @Date 19.11.2023
 * @Version 1.0
 */
@Data
@Entity
public class Collection {

    /**
     * The unique identifier for the collection.
     */
    @Id
    @Column(name = "collection_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The name of the collection.
     */
    private String name;

    /**
     * The list of coins associated with this collection.
     * <p>
     * This is a many-to-many relationship, and the association is bidirectional. It is mapped by the "collections"
     * property in the {@link Coin} class.
     *
     * @see Coin
     */
    @ManyToMany(mappedBy = "collections")
    @JsonIgnore
    @ToString.Exclude
    private List<Coin> coins;
}
/**
 * See Also: - {@link Coin} (Coin Entity): Represents a coin entity in the application.
 */

