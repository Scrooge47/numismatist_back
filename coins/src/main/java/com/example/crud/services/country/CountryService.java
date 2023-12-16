package com.example.crud.services.country;

import com.example.crud.dto.CountryDto;
import com.example.crud.dto.NewCountryDto;
import com.example.crud.dto.UpdateCountryDto;

public interface CountryService {

    CountryDto save(NewCountryDto country);

    CountryDto get(Long id);

    void delete(Long id);

    CountryDto update(Long id, UpdateCountryDto country);
}
