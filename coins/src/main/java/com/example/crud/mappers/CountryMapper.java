package com.example.crud.mappers;

import com.example.crud.dto.CountryDto;
import com.example.crud.dto.NewCountryDto;
import com.example.crud.models.Country;

public class CountryMapper {

    public static Country toCountry(CountryDto countryDto) {
        Country country = new Country();
        country.setId(countryDto.getId());
        country.setCode(countryDto.getCode());
        country.setName(countryDto.getName());
        return country;
    }

    public static Country toCountry(NewCountryDto countryDto) {
        Country country = new Country();
        country.setCode(countryDto.getCode());
        country.setName(countryDto.getName());
        return country;
    }

    public static CountryDto toCountryDto(Country country) {
        CountryDto countryDto = new CountryDto();
        countryDto.setId(country.getId());
        countryDto.setName(country.getName());
        countryDto.setCode(country.getCode());
        return countryDto;
    }
}
