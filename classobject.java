// class and object in java

class Car {
    // attributes
    String color;
    String model;
    int year;

    // method
    void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
}

public class classobject {
    public static void main(String[] args) {
        // creating an object of Car class
        Car myCar = new Car();
        // setting attributes
        myCar.color = "Red";
        myCar.model = "Toyota";
        myCar.year = 2020;
        // calling method
        myCar.displayInfo();
    }
}