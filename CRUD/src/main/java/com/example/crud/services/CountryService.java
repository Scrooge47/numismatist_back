package com.example.crud.services;

import com.example.crud.ex.ModelNotFoundException;
import com.example.crud.models.Country;

public interface CountryService {

    Country getCountryById(Long id) throws ModelNotFoundException;

    Country getCountryByName(String name) throws ModelNotFoundException;

    Country getCountryByCode(String code) throws ModelNotFoundException;

    Country saveCountry(Country country);

    void deleteCountryById(Long id);

}
