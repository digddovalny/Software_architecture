package org.example.hw3;


public class Program {
    public static void main(String[] args) {
        Harvester harvester = new Harvester("КамАЗ", "Уборщик", Color.ORANGE, FuelType.Diesel);
        SportCar sportCar = new SportCar("BMW", "M5", Color.GREEN, FuelType.Diesel);

        RefuelingStation refuelingStation = new RefuelingStation();
        WashCar washCar = new WashCar();

        harvester.setRefuelingStation(refuelingStation);
        harvester.fuel();
        harvester.setWiping(washCar);
        harvester.wipMirrors();

        sportCar.setRefuelingStation(refuelingStation);
        sportCar.fuel();
        sportCar.setWiping(washCar);
        sportCar.wipMirrors();
        sportCar.wipWindShield();
        sportCar.wipHeadlights();

    }
}
