package com.example.crud.controllers.admin;

import com.example.crud.dto.CoinDto;
import com.example.crud.dto.NewCoinDto;
import com.example.crud.dto.UpdateCoinDto;
import com.example.crud.services.coin.CoinService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController("admin/coin")
@AllArgsConstructor
public class CoinController {
    private CoinService coinService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public CoinDto createCoin(@RequestBody NewCoinDto newCoinDto) {
        return coinService.save(newCoinDto);
    }

    @GetMapping("/{coinId}")
    @ResponseStatus(HttpStatus.OK)
    public CoinDto getCoin(@PathVariable Long coinId) {
        return coinService.get(coinId);
    }

    @DeleteMapping("/{coinId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCoin(@PathVariable Long coinId) {
        coinService.delete(coinId);
    }

    @PatchMapping("/{coinId}")
    @ResponseStatus(HttpStatus.OK)
    public CoinDto updateCoin(@PathVariable Long coinId, @RequestBody UpdateCoinDto updateCoinDto) {
        return coinService.update(coinId, updateCoinDto);
    }
}
