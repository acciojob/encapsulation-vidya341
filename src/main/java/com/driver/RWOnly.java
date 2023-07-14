package com.driver;

import java.sql.SQLOutput;

public class RWOnly {
    private String name;

    public void setName(String name)
    {
        this.name = name;
        System.out.println(name);
    }
    public String getname()
    {
        return name;
    }
    
}
