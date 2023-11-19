package com.example.crud.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Data
@Embeddable
public class PriceKey implements Serializable {
    @ManyToOne
    @JoinColumn(name = "coin_id")
    private Coin coinId;
    @Enumerated(EnumType.STRING)
    private Condition condition;
}
