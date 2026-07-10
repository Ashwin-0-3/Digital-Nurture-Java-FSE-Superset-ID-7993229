package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/accounts")
public class accountscontroller {
    @GetMapping("/{num}")
    public Map<String,Object>print(@PathVariable String num)
    {
        Map<String,Object>hm=new HashMap<>();
        hm.put("Number",num);
        hm.put("Type","Savings");
        hm.put("Balance",234343);
        return hm;
    }
}
