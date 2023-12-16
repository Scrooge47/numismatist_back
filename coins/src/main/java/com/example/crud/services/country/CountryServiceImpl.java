package com.example.crud.services.country;

import com.example.crud.dto.CountryDto;
import com.example.crud.dto.NewCountryDto;
import com.example.crud.dto.UpdateCountryDto;
import com.example.crud.mappers.CountryMapper;
import com.example.crud.models.Country;
import com.example.crud.repositories.country.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    @Override
    public CountryDto save(NewCountryDto countryDto) {
        Country country = CountryMapper.toCountry(countryDto);
        return CountryMapper.toCountryDto(countryRepository.save(country));
    }

    @Override
    public CountryDto get(Long id) {
        return CountryMapper.toCountryDto(countryRepository.getCountryFromDb(id));
    }

    @Override
    public void delete(Long id) {
        Country country = countryRepository.getCountryFromDb(id);
        countryRepository.delete(country);
    }

    @Override
    public CountryDto update(Long id, UpdateCountryDto newCountry) {
        Country country = countryRepository.getCountryFromDb(id);
        if (newCountry.getCode() != null && !newCountry.getCode().isBlank() ) {
            country.setCode(newCountry.getCode());
        }
        if (newCountry.getName() != null && !newCountry.getName().isBlank()) {
            country.setName(newCountry.getName());
        }

        return CountryMapper.toCountryDto(countryRepository.save(country));
    }
}
