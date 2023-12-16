package com.example.crud.mappers;

import com.example.crud.dto.MintDto;
import com.example.crud.dto.NewMintDto;
import com.example.crud.models.Mint;

public class MintMapper {

    public static MintDto toMintDto(Mint mint) {
        MintDto mintDto = new MintDto();
        mintDto.setCountry(CountryMapper.toCountryDto(mint.getCountry()));
        mintDto.setId(mint.getId());
        mintDto.setName(mint.getName());
        return mintDto;
    }

    public static Mint toMint(NewMintDto mintDto) {
        Mint mint = new Mint();
        mint.setName(mintDto.getName());
        return mint;
    }
}
