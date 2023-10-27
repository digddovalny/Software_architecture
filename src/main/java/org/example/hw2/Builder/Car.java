package org.example.hw2.Builder;

public class Car {
    private String name;
    private double power;
    private double weight;
    private double speed;


    public Car(String name, double power, double weight, double speed) {
        this.name = name;
        this.power = power;
        this.weight = weight;
        this.speed = speed;

        System.out.println(this.toString());
    }

    public String getName() {
        return name;
    }

    public double getPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }


    public Double getSpeed() {
        return speed;
    }


    @Override
    public String toString() {
        return "parameter{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                ", weight='" + weight + '\'' +
                ", speed=" + speed + '\'' +
                '}';
    }
}
