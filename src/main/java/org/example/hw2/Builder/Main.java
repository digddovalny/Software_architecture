package org.example.hw2.Builder;

public class Main {
    public static void main(String[] args) {
        ICarBuilder builder = new SportCarBuilder();
        AutomotiveEngineer engineer = new AutomotiveEngineer(builder);
        Car car = engineer.manufactureCar();

        if (car != null) {
            System.out.println(car);
        }
    }
}
