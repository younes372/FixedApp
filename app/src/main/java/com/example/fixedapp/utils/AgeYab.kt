package com.example.fixedapp.utils

class AgeYab {


    companion object {

        fun ageFind(name: String): String? {
            when {
                name.equals("imam ali", false)
                -> return String.format("He is %s years old", "63")
                name.equals("imam zaman", false)
                -> return String.format("He is %s years old", "1186")
                name.equals("Jesus", false) || name.equals("Hazrat isa", false)
                -> return String.format("He is %s years old", "2020")
                name.equals("Hazrat Khezr", false)
                -> return String.format("He is %s years old", "4000")
            }
            return ""
        }

    }


}

//  String sf3=String.format("value is %25.12f",25.33434); value is  32.334340000000