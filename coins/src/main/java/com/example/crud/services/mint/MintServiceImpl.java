package com.example.crud.services.mint;

import com.example.crud.dto.MintDto;
import com.example.crud.dto.NewMintDto;
import com.example.crud.dto.UpdateMintDto;
import com.example.crud.mappers.MintMapper;
import com.example.crud.models.Country;
import com.example.crud.models.Mint;
import com.example.crud.repositories.country.CountryRepository;
import com.example.crud.repositories.mint.MintRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MintServiceImpl implements MintService {

    private CountryRepository countryRepository;
    private MintRepository mintRepository;

    @Override
    public MintDto save(Long countryId, NewMintDto newMintDto) {
        Country country = countryRepository.getCountryFromDb(countryId);
        Mint mint = MintMapper.toMint(newMintDto);
        mint.setCountry(country);
        return MintMapper.toMintDto(mintRepository.save(mint));
    }

    @Override
    public MintDto get(Long countryId, Long mintId) {
        Country country = countryRepository.getCountryFromDb(countryId);
        return MintMapper.toMintDto(mintRepository.getMintFromDb(mintId));
    }

    @Override
    public void delete(Long countryId, Long mintId) {
        Country country = countryRepository.getCountryFromDb(countryId);
        Mint mint = mintRepository.getMintFromDb(mintId);
        mintRepository.delete(mint);
    }

    @Override
    public MintDto update(Long countryId, Long mintId, UpdateMintDto newMint) {
        Country country = countryRepository.getCountryFromDb(countryId);
        Mint mint = mintRepository.getMintFromDb(mintId);
        if (newMint.getName() != null && !newMint.getName().isBlank()) {
            mint.setName(newMint.getName());
        }
        mint.setCountry(country);
        return MintMapper.toMintDto(mintRepository.save(mint));
    }
}
