package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/loans")
public class loancontroller {

    @GetMapping("/{num}")
    public Map<String,Object> print (@PathVariable int num)
    {
        Map<String,Object> hm=new HashMap<>();
        hm.put("Number",num);
        hm.put("Type","Car");
        hm.put("Loan",450000);
        hm.put("EMI",3258);
        hm.put("Tenure",18);
        return hm;
    }
}
