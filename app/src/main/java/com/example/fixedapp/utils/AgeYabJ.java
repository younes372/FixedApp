package com.example.fixedapp.utils;

public class AgeYabJ {

    public static String ageFind(String name) {



            switch (name) {
                case "imam ali":
                    return String.format("He is %s years old", "63");
                case "imam zaman":
                    return String.format("He is %s years old", "1186");
                case "Jesus":
                    return String.format("He is %s years old", "2020");
                case "Hazrat Khezr":
                    return String.format("He is %s years old", "4000");
                default:
                    return "this name dose not exist";

            }

    }

}
