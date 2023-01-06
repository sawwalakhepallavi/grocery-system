package com.bootcoding.discount.utils;

import java.util.Random;

public class CityGenerator {
    private static String[] cities =
            {"nagpur", "amravti", "pune", "ujjain",
                    "bhandara", "kolhapur", "raypur", "mumbai",
                    "bhopal", "goa", "gujrat",
                    "manali", "kasmir", "agra", "chandrapur", "bareli"};

    public static String getCity() {
        Random random = new Random();
        int randomIndex = random.nextInt(cities.length);
        return cities[randomIndex];
    }

    public static void main(String[] args) {
        CityGenerator.getCity();
    }
}
