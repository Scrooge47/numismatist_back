package com.example.crud.repositories.coin;

import com.example.crud.ex.ModelNotFoundException;
import com.example.crud.models.Coin;
import org.springframework.context.annotation.Lazy;

public class CoinRepositoryCustomImpl implements CoinRepositoryCustom {

    private final CoinRepository coinRepository;

    public CoinRepositoryCustomImpl(@Lazy CoinRepository coinRepository) {
        this.coinRepository = coinRepository;
    }

    @Override
    public Coin getCoinFromDb(Long id) {
        return coinRepository.findById(id).orElseThrow(() ->
                new ModelNotFoundException("Coin with id = %s not found".formatted(id)));
    }
}
