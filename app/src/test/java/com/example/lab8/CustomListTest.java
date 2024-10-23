package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList mockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void testAddCity() {
        list = mockCityList();
        list.addcity(new City("edmonton", "alberta"));
        int listSize = list.getCount();
        assertEquals(1, listSize);

    }

}
