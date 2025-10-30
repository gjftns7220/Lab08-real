package com.example.lab08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList {
    private List<City> cities = new ArrayList<>();

    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void add(City city) {
        cities.add(city);
    }
    public boolean hasCity(City city) {
        return cities.contains(city);
    }
    

    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
}
