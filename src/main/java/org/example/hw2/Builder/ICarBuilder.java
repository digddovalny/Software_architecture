package org.example.hw2.Builder;

public interface ICarBuilder {
    public ICarBuilder name();
    public ICarBuilder power();
    public ICarBuilder weight();
    public ICarBuilder speed();

    public Car build();

}
