package com.mycompany.data;

/**
 * Created by Kornel Mikolajski on 07.05.2017.
 */
public class Driver {
    private String name;
    private String surname;
   // private Car car;

    public Driver(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
