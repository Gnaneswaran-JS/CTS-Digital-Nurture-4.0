package com.cognizant.orm_learn;
import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class CountryRepositoryTest {

    @Autowired
    private CountryRepository countryRepository;

    @Test
    public void testGetAllCountries() {
        List<Country> countries = countryRepository.findAll();
        System.out.println("countries=" + countries);
        assertFalse(countries.isEmpty());  // optional assertion
    }
}
