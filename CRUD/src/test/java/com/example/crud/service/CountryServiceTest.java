package com.example.crud.service;

import com.example.crud.ex.ModelNotFoundException;
import com.example.crud.models.Country;
import com.example.crud.repositories.CountryRepository;
import com.example.crud.services.CountryService;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CountryServiceTest {
    private CountryService countryService;
    private CountryRepository countryRepository;
    @BeforeAll
    public void setUp() {
        var countries = new ArrayList<>(List.of(new Country[]{
                new Country(1L, "United States", "US"),
                new Country(2L, "Canada", "CA"),
                new Country(3L, "Mexico", "MX")
        }));
        countryRepository = mock(CountryRepository.class);
        when(countryRepository.findAll()).thenReturn(countries);
        when(countryRepository.findByName(anyString())).thenThrow(new RuntimeException());
    }
    @BeforeEach
    public void prepare() {
        countryService = new CountryService(countryRepository);
    }
    @Test
    public void getAllCountries() {
        var countries = countryService.getAllCountries();
        Assertions.assertEquals(3, countries.size());
        Assertions.assertEquals(countries, countries);
    }
}
