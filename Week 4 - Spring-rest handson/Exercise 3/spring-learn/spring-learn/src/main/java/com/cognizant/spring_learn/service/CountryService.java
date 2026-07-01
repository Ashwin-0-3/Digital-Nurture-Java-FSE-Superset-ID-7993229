package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class CountryService {
        private List<Country> countryList = Arrays.asList(
                        new Country("Ind","India"),
                        new Country("Jp","Japan"),
                        new Country("USA","America"),
                        new Country("Chn","China")
        );

        public Country get(String a) {
        return countryList.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(a))
                .findFirst()
                .orElse(null);
    }
}
