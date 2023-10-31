package org.example.hw3;

public class WashCar implements Wiping{
    @Override
    public void wipMirrors() {
        System.out.println("Протерка зеркал");
    }

    @Override
    public void wipWindShield() {
        System.out.println("Протерка лобового стекла");
    }

    @Override
    public void wipHeadlights() {
        System.out.println("Протерка противотуманных фар");
    }
}
