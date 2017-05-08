package com.mycompany.data;

import java.util.Random;

/**
 * Created by Kornel Mikolajski on 07.05.2017.
 */
public class Car {
    private String brand;   // brand of car
    private int weight;
    private int mileage;
    private String type;    //bus, truck, normal car4
    private String registrationPlate;      //didnt know is 'plates' is enough ;)
    private double latidute;
    private double longitude;
    private Driver driver = null;

    //default constructor
    Car(){}

    static int maxLatidute = 90;
    static int maxLongtidute = 180;
    static Random randomGenerator = new Random();

    //constructor 2
    public Car(String brand, int weight, int mileage, String type, String registrationPlate) {
        this.brand = brand;
        this.weight = weight;
        this.mileage = mileage;
        this.type = type;
        this.registrationPlate = registrationPlate;
        this.latidute = Math.random() + randomGenerator.nextInt(maxLatidute-1);
        this.longitude = Math.random() + randomGenerator.nextInt(maxLongtidute-1);
    }

    public void showDetails()
    {
        System.out.println("Brand: " + brand + ", weight: " + weight + ", mileage: " + mileage + ", registration plate: " + registrationPlate + ", type: " + type);
    }

    public void setLatidute(double latidute) {
        this.latidute = latidute;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public double getLatidute() {
        return latidute;
    }

    public double getLongitude() {
        return longitude;
    }

    public void showPosition ()
    {
        System.out.println("Latidute: " + getLatidute());
        System.out.println("Longtidute: " + getLongitude());
    }
}
