package com.example.crud.services.coin;


import com.example.crud.dto.*;

public interface CoinService {
    CoinDto save(NewCoinDto coin);

    CoinDto get(Long id);

    void delete(Long id);

    CoinDto update(Long id, UpdateCoinDto coin);
}
