package com.bootcoding.discount.utils;

import java.util.Random;

public class SubjectGenerator {
    private static String[] names =
            {"maths", "chemistry", "physic", "hindi",
                    "bio", "history", "geography","marathi"};
    public static String getSubject() {
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];
    }

    public static void main(String[] args) {
        SubjectGenerator.getSubject();

    }
}
