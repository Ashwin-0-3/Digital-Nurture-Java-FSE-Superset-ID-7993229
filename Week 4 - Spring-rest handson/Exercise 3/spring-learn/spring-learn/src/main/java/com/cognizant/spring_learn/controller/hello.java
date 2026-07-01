package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class hello {
    @Autowired
    private CountryService cs;
    @GetMapping("/hello")
    public String print()
    {
        return("Hello");
    }
    @GetMapping("/countries")
    public List<Country> b()
    {
        return Arrays.asList(
                new Country("Ind","India"),
                new Country("Jp","Japan"),
                new Country("USA","America"),
                new Country("Chn","China")
        );
    }
    @GetMapping("/country/{a}")
    public Country a(@PathVariable String a)
    {
        return cs.get(a);
    }
}
