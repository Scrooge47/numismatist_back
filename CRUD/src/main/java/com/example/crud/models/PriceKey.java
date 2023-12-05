package com.example.crud.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

/**
 * Represents the composite key for the Price entity, consisting of coinId and condition.
 *
 * @Author Konstantin Kokoshnikov
 * @Date 19.11.2023
 * @Version 1.0
 */
@Data
@Embeddable
public class PriceKey implements Serializable {

    /**
     * The coin associated with the price.
     */
    @ManyToOne
    @JoinColumn(name = "coin_id")
    private Coin coinId;

    /**
     * The condition of the coin associated with the price. See {@link Condition}.
     */
    @Enumerated(EnumType.STRING)
    private Condition condition;
}