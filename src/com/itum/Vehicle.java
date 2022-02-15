package com.itum;

public class Vehicle {
    String modelYear = "2000";
    String brand = "Toyota";

    public void checkEngine(){
        System.out.println("Engine is running");
}
}

class Car extends Vehicle {
    public Car() {
    super();
    }

    public static void main(String[] args) {
        String modelYear = "2020";
        String brand = "Honda";

        Car myCar = new Car();
        myCar.checkEngine();
        System.out.println("Model Year: "+modelYear+ "Brand: "+myCar.brand);
    }


}




