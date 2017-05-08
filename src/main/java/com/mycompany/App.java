package com.mycompany;

import com.mycompany.data.Company;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Company myCompany = new Company();
        myCompany.addCar("KIA", 1350, 90000, "car", "KRA802K");
        myCompany.addCar("Toyota", 1200, 45600, "car", "KRA8JP9");
        myCompany.addCar("Mercedes", 4100, 125050, "bus", "KR78901");
        myCompany.addCar("Solaris",4900 , 99750, "bus", "KCH8JP9");
        myCompany.addCar("Mercedes", 3450, 210500, "truck", "KWA8NA2");
        myCompany.addCar("Żuk", 1900, 190100, "truck", "KWARK06");

        myCompany.addDriver("Kuba", "Rozpruwacz");
        myCompany.addDriver("Grzegorz", "Brzęczyszczykiewicz");
        myCompany.addDriver("Lionel", "Messi");
        myCompany.addDriver("Stanisław", "Małofajny");
        myCompany.addDriver("Grzegorz", "Foka");
        myCompany.addDriver("Jurek", "Małosolny");

        myCompany.sizeOfFleet();
        myCompany.showAll();
        System.out.println("---showDetails---");
        myCompany.showDetails("KWARK06");   //shows details of car KWARK06
        System.out.println("---sizeOfFleet---");
        myCompany.sizeOfFleet();    //shows size of whole fleet (six before remove)
        System.out.println("---removeCar---");
        myCompany.removeCar("KWARK06"); //removes car KWARK06
        System.out.println("---sizeOfFleet---");
        myCompany.sizeOfFleet();    //shows size of whole fleet (five after remove)


        System.out.println("------howManyCarsOnTheRoad------");
        myCompany.howManyCarsOnTheRoad();
        System.out.println();

        System.out.println("---carGoesOnRoad---");
        myCompany.carGoesOnRoad("KWA8NA2");
        System.out.println();

        System.out.println("---howManyCarsOnTheRoad---");
        myCompany.howManyCarsOnTheRoad();
        System.out.println();

        System.out.println("---numberOfCarsInTheBase---");
        myCompany.numberOfCarsInTheBase();
        System.out.println();

        System.out.println("---carsOnTheRoad---");
        myCompany.carsOnTheRoad();
        System.out.println();

        System.out.println("---carComesBack---");
        myCompany.carComesBack("KWA8NA2");
        System.out.println();

        System.out.println("---howManyCarsOnTheRoad---");
        myCompany.howManyCarsOnTheRoad();
        System.out.println();

        System.out.println("---setCarToDriver---");
        myCompany.setCarToDriver("KRA802K", "Brzęczyszczykiewicz");
        myCompany.setCarToDriver("KRA8JP9", "Messi");
        myCompany.setCarToDriver("KR78901", "Małosolny");
        myCompany.setCarToDriver("KCH8JP9", "Foka");
        myCompany.setCarToDriver("KWA8NA2", "Rozpruwacz");
        //myCompany.setCarToDriver("KWARK06", "Małofajny");
        System.out.println();
/*        System.out.println("---myCompany.searchCar(\"KWA8NA2\").getDriver().getSurname()---");
        System.out.println(myCompany.searchCar("KWA8NA2").getDriver().getSurname());
*/

        System.out.println("---findCarByDriver---");
        myCompany.findCarByDriver("Rozpruwacz");
        System.out.println();

        System.out.println("---showPositionBySurname---");
        myCompany.showPositionBySurname("Rozpruwacz");
    }
}
