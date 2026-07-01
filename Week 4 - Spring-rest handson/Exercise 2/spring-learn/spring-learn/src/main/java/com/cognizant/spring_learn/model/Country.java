package com.cognizant.spring_learn.model;

public class Country {
    private String code ;
    private String name;
    public Country(String code,String name)
    {
        this.name=name;
        this.code=code;
    }
    public String getCode()
    {
        return code;
    }
    public String getName()
    {
        return name;
    }
}
