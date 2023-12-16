package com.example.crud.repositories.country;

import com.example.crud.ex.ModelNotFoundException;
import com.example.crud.models.Country;
import org.springframework.context.annotation.Lazy;

public class CountryRepositoryCustomImpl implements CountryRepositoryCustom {

    private final CountryRepository countryRepository;

    public CountryRepositoryCustomImpl(@Lazy CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Country getCountryFromDb(Long id) {
        return countryRepository.findById(id).orElseThrow(() ->
                new ModelNotFoundException("Country with id = %s not found".formatted(id)));
    }
}
