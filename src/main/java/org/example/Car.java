package org.example;

public class Car extends Vehicle {
    String brand;

    //Constructor
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }
    //Getter
    public String getBrand() {
        return brand;
    }
    //Setter
    public void setBrand(String brand) {
        this.brand = brand;
    }
    //Method honk that says 'Honk, honk!'
    public void honk () {
        System.out.println("Honk, honk!");
    }
    //Method displayInfo that print all info from both classes
    public void displayInfo () {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Size: " + getEngineSize() + "L");
        System.out.println("Fuel Type: " + getFuelType());
    }
}
