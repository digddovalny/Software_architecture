package org.example.hw2.Builder;

public class ClassicCarBuilder implements ICarBuilder{
    private String name;
    private double weight;
    private double speed;
    private double power;

    public ClassicCarBuilder() {
        super();
    }

    @Override
    public ClassicCarBuilder name() {
        this.name = "Car";
        return this;
    }

    @Override
    public ClassicCarBuilder power() {
        this.power = 55.0;
        return this;
    }

    @Override
    public ClassicCarBuilder weight() {
        this.weight = 1000.65;
        return this;
    }

    @Override
    public ClassicCarBuilder speed() {
        this.speed = 110.0;
        return this;
    }

    @Override
    public Car build() {
        Car car = new Car(name, power, weight, speed);
        return car;
    }
}
