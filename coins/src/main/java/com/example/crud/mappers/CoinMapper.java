package com.example.crud.mappers;

import com.example.crud.dto.CoinDto;
import com.example.crud.dto.NewCoinDto;
import com.example.crud.models.Coin;

public class CoinMapper {

    public static Coin toCoin(NewCoinDto newCoinDto) {
        Coin coin = new Coin();
        coin.setCirculation(newCoinDto.getCirculation());
        coin.setName(newCoinDto.getName());
        coin.setDescription(newCoinDto.getDescription());
        coin.setNominal(newCoinDto.getNominal());
        coin.setYear(newCoinDto.getYear());
        coin.setCurrency(newCoinDto.getCurrency());
        return coin;
    }

    public static CoinDto toCoinDto(Coin coin) {
        CoinDto coinDto = new CoinDto();
        coinDto.setCirculation(coin.getCirculation());
        coinDto.setName(coin.getName());
        coinDto.setDescription(coin.getDescription());
        coinDto.setYear(coin.getYear());
        coinDto.setCurrency(coin.getCurrency());
        coinDto.setCounty(CountryMapper.toCountryDto(coin.getCountry()));
        coinDto.setMint(MintMapper.toMintDto(coin.getMint()));
        coinDto.setMaterial(MaterialMapper.toMaterialDto(coin.getMaterial()));
        return coinDto;
    }

}
