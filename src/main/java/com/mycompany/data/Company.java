package com.mycompany.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kornel Mikolajski on 07.05.2017.
 */
public class Company {
    private List<Car> companyVehicleFleet = new ArrayList<Car>();
    private List<Car> carOnRoad = new ArrayList<Car>();
    private List<Driver> drivers = new ArrayList<Driver>();

    public void sizeOfFleet()
    {
        if (companyVehicleFleet.size() > 1)
            System.out.println("There is " + companyVehicleFleet.size() + " cars in company.");
        else if (companyVehicleFleet.size() == 1)
            System.out.println("There is only" + companyVehicleFleet.size() + " car in company.");
        else
            System.out.println("There is no cars in company");
    }

    public void showAll()
    {
        for (int i = 0; i < companyVehicleFleet.size(); i++) {
            companyVehicleFleet.get(i).showDetails();
        }
    }

    //showing details of a car
    public void showDetails(String registrationPlate)
    {
        Car carFound = searchCar(registrationPlate);
        carFound.showDetails();
    }


    //searching car in company fleet
    public Car searchCar(String registrationPlate)
    {
        for (int i = 0; i < companyVehicleFleet.size(); i++) {
            if (companyVehicleFleet.get(i).getRegistrationPlate().equals(registrationPlate)) {
                return companyVehicleFleet.get(i);
            }
        }
        return null;
    }

    //searching car in carOnRoad-LIST ;)
    Car searchCarOnRoad(String registrationPlate)
    {
        for (int i = 0; i < carOnRoad.size(); i++) {
            if (carOnRoad.get(i).getRegistrationPlate().equals(registrationPlate)) {
                return carOnRoad.get(i);
            }
        }
        return null;
    }

    //adding cars
    public void addCar(String brand, int weight, int mileage, String type, String registrationPlate)
    {
        Car newCar = new Car (brand,weight,mileage,type, registrationPlate);
        companyVehicleFleet.add(newCar);
    }

    //removing cars
    public void removeCar (String registrationPlate)
    {
        System.out.println("Car \"" + registrationPlate + "\" removed.");
        Car carFound = searchCar(registrationPlate);
        if (carFound != null)
            companyVehicleFleet.remove(carFound);
        else
            System.out.println("Car " + registrationPlate + " did not found.");
    }

    //car is leaving a base and goes on the road
    public void carGoesOnRoad (String registrationPlate /*add fu*kin' driver*/)     /////////////////////////////////////////////////
    {
        Car carFound = searchCar(registrationPlate);
        carOnRoad.add(carFound);
        System.out.println("Car: " + carFound.getRegistrationPlate() + " is on the road.");
    }

    //car is returning to base from the road
    public void carComesBack (String registrationPlate)
    {
        Car carFound = searchCarOnRoad(registrationPlate);

        if (carFound != null) {
            carOnRoad.remove(carFound);
            System.out.println("Car " + registrationPlate + " has returned to base.");
        }
        else
            System.out.println("Car " + registrationPlate + " did not found.");
    }

    //shows how many cars is on the road
    public void howManyCarsOnTheRoad()
    {
        if (carOnRoad.size() > 1)
            System.out.println("There is " + carOnRoad.size() + " cars on the road.");
        else if (carOnRoad.size() == 1)
            System.out.println("There is only one car on the road");
        else
            System.out.println("There is no cars on the road.");
    }

    //shows details of the cars on the road
    public void carsOnTheRoad()
    {
        if (carOnRoad.size() > 0) {
            System.out.println("Details of all cars on the road:");
            for (int i = 0; i < carOnRoad.size(); i++) {
                carOnRoad.get(i).showDetails();
            }
        }
        else
            System.out.println("There is no cars on the road.");
    }

    //shows how many cars is in the base
    public void numberOfCarsInTheBase()
    {
        int numberOfCarsOnTheRoad = companyVehicleFleet.size() - carOnRoad.size();
        System.out.println(numberOfCarsOnTheRoad + "/" + companyVehicleFleet.size() + " cars in the base");
    }

    //searching driver in DRIVERS list by surname
    public Driver searchDriver(String surname)
    {
        for (int i = 0; i < drivers.size(); i++) {
            if (drivers.get(i).getSurname().equals(surname)) {
                return drivers.get(i);
            }
        }
        return null;
    }

    //sets car to driver by registrationPlate and surname
    public void setCarToDriver(String registrationPlate, String surname)
    {
        System.out.println("-");
        Car carFound = searchCar(registrationPlate);
        carFound.showDetails();
        Driver driverFound = searchDriver(surname);
        System.out.println(driverFound.getSurname());
        carFound.setDriver(driverFound);
    }

    //adding driver to company
    public void addDriver (String name, String surname)
    {
        Driver newDriver = new Driver(name, surname);
        drivers.add(newDriver);
    }

    //removes driver from company - probably fired
    public void removeDriver (String name, String surname)
    {
        System.out.println("Let's kick out " + name + ".");
        Driver driverFound = searchDriver(surname);
        if (driverFound != null) {
            drivers.remove(driverFound);
            System.out.println(surname + " removed... I mean fired...");
        }
        else
            System.out.println("Driver " + surname + " did not found.");
    }


    //finding driver and shows his car by drivers name
    public void findCarByDriver (String surname)
    {
        for (int i = 0; i < companyVehicleFleet.size(); i++) {
            if (companyVehicleFleet.get(i).getDriver() != null && companyVehicleFleet.get(i).getDriver().getSurname().equals(surname))
            {
                System.out.println(companyVehicleFleet.get(i).getDriver().getSurname());
                companyVehicleFleet.get(i).showDetails();
            }
        }
    }

    public void showPositionBySurname(String surname)
    {
        for (int i = 0; i < companyVehicleFleet.size(); i++) {
            if (companyVehicleFleet.get(i).getDriver() != null && companyVehicleFleet.get(i).getDriver().getSurname().equals(surname))
                companyVehicleFleet.get(i).showPosition();
        }
    }
}
