package org.example.lesson3;

public class Harvester extends Car {

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }

    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
    }

    private boolean fogLights = false;

    public boolean switchFogLights() {
        fogLights = !fogLights;
        return fogLights;
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    public Harvester(String make, String model, Color color) {
        super(make, model, color);
    }
}
