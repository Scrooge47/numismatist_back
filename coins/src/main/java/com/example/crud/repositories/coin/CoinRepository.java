package com.example.crud.repositories.coin;

import com.example.crud.models.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepository extends JpaRepository<Coin, Long>, CoinRepositoryCustom {
}
