package com.example.crud.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Price {
    @EmbeddedId
    @Column(name = "price_id")
    private PriceKey id;
    private Integer price;
}
