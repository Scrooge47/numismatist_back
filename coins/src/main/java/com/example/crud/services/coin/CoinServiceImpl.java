package com.example.crud.services.coin;

import com.example.crud.dto.CoinDto;
import com.example.crud.dto.NewCoinDto;
import com.example.crud.dto.UpdateCoinDto;
import com.example.crud.mappers.CoinMapper;
import com.example.crud.models.Coin;
import com.example.crud.models.Country;
import com.example.crud.models.Material;
import com.example.crud.models.Mint;
import com.example.crud.repositories.coin.CoinRepository;
import com.example.crud.repositories.country.CountryRepository;
import com.example.crud.repositories.material.MaterialRepository;
import com.example.crud.repositories.mint.MintRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CoinServiceImpl implements CoinService {

    private CoinRepository coinRepository;
    private CountryRepository countryRepository;
    private MintRepository mintRepository;
    private MaterialRepository materialRepository;

    @Override
    public CoinDto save(NewCoinDto coin) {
        Country country = countryRepository.getCountryFromDb(coin.getCountyId());
        Mint mint = mintRepository.getMintFromDb(coin.getMintId());
        Material material = materialRepository.getMaterialFromDb(coin.getMintId());
        Coin newCoin = CoinMapper.toCoin(coin);
        newCoin.setCountry(country);
        newCoin.setMint(mint);
        newCoin.setMaterial(material);
        return CoinMapper.toCoinDto(coinRepository.save(newCoin));
    }

    @Override
    public CoinDto get(Long id) {
        return CoinMapper.toCoinDto(coinRepository.getCoinFromDb(id));
    }

    @Override
    public void delete(Long id) {
        Coin coin = coinRepository.getCoinFromDb(id);
        coinRepository.delete(coin);
    }

    @Override
    public CoinDto update(Long id, UpdateCoinDto newCoin) {
        Coin coin = coinRepository.getCoinFromDb(id);
        if (newCoin.getName() != null && !newCoin.getName().isBlank()) {
            coin.setName(newCoin.getName());
        }
        if (newCoin.getDescription() != null && !newCoin.getDescription().isBlank()) {
            coin.setDescription(newCoin.getDescription());
        }
        if (newCoin.getYear() != null) {
            coin.setYear(newCoin.getYear());
        }

        if (newCoin.getNominal() != null) {
            coin.setNominal(newCoin.getNominal());
        }

        if (newCoin.getCirculation() != null) {
            coin.setCirculation(newCoin.getCirculation());
        }

        if (newCoin.getCountyId() != null) {
            Country country = countryRepository.getCountryFromDb(newCoin.getCountyId());
            coin.setCountry(country);
        }

        if (newCoin.getMintId() != null) {
            Mint mint = mintRepository.getMintFromDb(newCoin.getMintId());
            coin.setMint(mint);
        }

        if (newCoin.getMaterialId() != null) {
            Material material = materialRepository.getMaterialFromDb(newCoin.getMintId());
            coin.setMaterial(material);
        }
        return CoinMapper.toCoinDto(coinRepository.save(coin));
    }
}
