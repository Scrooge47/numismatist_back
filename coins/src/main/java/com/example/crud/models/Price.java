package com.example.crud.models;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Represents a price entity in the application. A price is associated with a specific coin and condition.
 *
 * @Author Konstantin Kokoshnikov
 * @Date 19.11.2023
 * @Version 1.0
 *
 */
@Data
@Entity
public class Price {
    /**
     * The composite key for the price entity. See {@link PriceKey}.
     */
    @EmbeddedId
    @Column(name = "price_id")
    private PriceKey id;

    /**
     * The price value associated with the coin and condition.
     */
    private Integer price;
}
/**
 * See Also:
 * - {@link Coin} (Coin Entity): Represents a coin entity in the application.
 * - {@link Condition} (Condition Entity): Represents a condition entity in the application.
 * - {@link PriceKey} (PriceKey Embeddable): Represents a composite key for the price entity.
 */
