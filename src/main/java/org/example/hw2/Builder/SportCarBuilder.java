package org.example.hw2.Builder;

public class SportCarBuilder implements ICarBuilder{
    private String name;
    private double weight;
    private double speed;
    private double power;

    public SportCarBuilder() {
    }

    @Override
    public SportCarBuilder name() {
        this.name = "SomeCar";
        return this;
    }

    @Override
    public SportCarBuilder power() {
        this.power = 555.0;
        return this;
    }

    @Override
    public SportCarBuilder weight() {
        this.weight = 1700.65;
        return this;
    }

    @Override
    public SportCarBuilder speed() {
        this.speed = 330.0;
        return this;
    }

    @Override
    public Car build() {
        Car car = new Car(name, power, weight, speed);
        return car;
    }
}
