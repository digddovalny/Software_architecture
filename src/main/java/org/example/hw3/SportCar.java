package org.example.hw3;

public class SportCar extends Car implements Refueling, Wiping {

    private Refueling refueling;
    private Wiping wiping;
    public SportCar(String make, String model, Color color, FuelType fuelType) {
        super(make, model, color, fuelType);
        setWheelsCount(3);
    }

    public void setWiping(Wiping wiping){
        this.wiping = wiping;
    }

    public void setRefuelingStation(RefuelingStation refuelingStation){
        this.refueling = refuelingStation;
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
