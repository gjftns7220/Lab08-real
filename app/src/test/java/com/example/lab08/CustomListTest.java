package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    private CustomList mockCityList() {
        CustomList cityList = new CustomList();
        cityList.add(mockCity());
        return cityList;
    }
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.add(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }
    @Test
    void testDelete(){
        CustomList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City regina = new City("Regina", "Saskatchewan");
        cityList.add(regina);
        assertEquals(2, cityList.getCities().size());
        cityList.delete(regina);
        assertEquals(1, cityList.getCities().size());
        assertFalse(cityList.hasCity(regina));
    }

    @Test
    void testDeleteExeption(){
        CustomList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City bingusLand = new City("Bingus", "Land");
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(bingusLand);
        });
    }

    @Test
    void testCountCity(){
        CustomList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertEquals(2, cityList.countCity());

    }
}
