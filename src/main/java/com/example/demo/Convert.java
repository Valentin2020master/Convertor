package com.example.demo;

public class Convert {
    public static String convertTemp(float temperature, char convertIn, Temperatura convert) {

        if (convertIn == 'F') {
            return "Am convertit " + temperature + " grade C. Temperatura în Fahrenheit este " + (9 * temperature / 5 + 32) + " F";
        } else if (convertIn == 'C') {
            return "Am convertit " + temperature + " grade F. Temperatura în Celsius este " + (temperature - 32) * 5 / 9 + " C";
        } else {
            return "Puteți introduce F sau C ca argument convertIn";
        }
    }
}
