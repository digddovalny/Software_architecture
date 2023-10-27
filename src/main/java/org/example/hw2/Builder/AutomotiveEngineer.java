package org.example.hw2.Builder;

public class AutomotiveEngineer {
    private ICarBuilder builder;

    public AutomotiveEngineer(ICarBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null){
            throw new IllegalArgumentException("Error");
        }
    }

    public Car manufactureCar(){
        return builder.name().power().speed().weight().build();
    }
}
