package com.example.crud.controllers.admin;

import com.example.crud.dto.CountryDto;
import com.example.crud.dto.NewCountryDto;
import com.example.crud.dto.UpdateCountryDto;
import com.example.crud.services.country.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
@AllArgsConstructor
public class CountryController {

    private CountryService countryService;

    @PostMapping("/country")
    @ResponseStatus(HttpStatus.CREATED)
    public CountryDto createCountry(@RequestBody NewCountryDto countryDto) {
        return countryService.save(countryDto);
    }

    @GetMapping("/country/{countryId}")
    @ResponseStatus(HttpStatus.OK)
    public CountryDto getCounty(@PathVariable Long countryId) {
        return countryService.get(countryId);
    }

    @DeleteMapping("/country/{countryId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCountry(@PathVariable Long countryId) {
        countryService.delete(countryId);
    }

    @PatchMapping("/country/{countryId}")
    @ResponseStatus(HttpStatus.OK)
    public CountryDto updateCountry(@PathVariable Long countryId, @RequestBody UpdateCountryDto countryDto) {
        return countryService.update(countryId, countryDto);
    }
}
