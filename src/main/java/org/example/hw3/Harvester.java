package org.example.hw3;

public class Harvester extends Car implements Refueling, Wiping {

    private Wiping wiping;
    private Refueling refueling;
    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }

    public Harvester(String make, String model, Color color, FuelType fuelType) {
        super(make, model, color, fuelType);
        setWheelsCount(6);
    }


    public void setRefuelingStation(RefuelingStation refuelingStation){
        this.refueling = refuelingStation;
    }
    public void setWiping(Wiping wiping){
        this.wiping = wiping;
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

    @Override
    public void fuel(FuelType fuelType) {

    }

    @Override
    public void wipMirrors() {
        wiping.wipMirrors();
    }

    @Override
    public void wipWindShield() {
        wiping.wipWindShield();
    }

    @Override
    public void wipHeadlights() {
        wiping.wipHeadlights();
    }
}
