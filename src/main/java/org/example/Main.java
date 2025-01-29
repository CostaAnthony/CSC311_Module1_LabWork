package org.example;

public class Main {
    public static void main(String[] args) {
        //Instantiating a Vehicle object
        Vehicle vehicle = new Vehicle(4, "White", 3.6F, "Gas");
        System.out.println("Vehicle Class Test:");
        System.out.println("Number of wheels: " + vehicle.numberOfWheels);
        System.out.println("Color: " + vehicle.color);
        System.out.println("Engine Size: " + vehicle.engineSize);
        System.out.println("Fuel Type: " + vehicle.fuelType);
        // Instantiating a Car object
        Car car = new Car(4, "Blue", 6.4F, "Gas", "Chevy");
        System.out.println("Car Methods Test:");
        System.out.println("Car Info:");
        car.displayInfo();
        car.honk();
    }
}