package com.example.crud.services;

import com.example.crud.ex.ModelNotFoundException;
import com.example.crud.models.Country;
import com.example.crud.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Country getCountryById(Long id) throws ModelNotFoundException {
        return countryRepository.findById(id).orElseThrow(ModelNotFoundException::new);
    }

    public Country getCountryByName(String name) throws ModelNotFoundException {
        return countryRepository.findByName(name).orElseThrow(ModelNotFoundException::new);
    }

    public Country getCountryByCode(String code) throws ModelNotFoundException {
        return countryRepository.findByCode(code).orElseThrow(ModelNotFoundException::new);
    }

    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    public void deleteCountryById(Long id) {
        countryRepository.deleteById(id);
    }

}
