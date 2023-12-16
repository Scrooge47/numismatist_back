package com.example.crud.repositories.coin;

import com.example.crud.models.Coin;

public interface CoinRepositoryCustom {

    Coin getCoinFromDb(Long id);
}
