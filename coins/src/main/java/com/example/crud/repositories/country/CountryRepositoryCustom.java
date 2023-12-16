package com.example.crud.repositories.country;

import com.example.crud.models.Country;

public interface CountryRepositoryCustom {

    Country getCountryFromDb(Long id);
}
