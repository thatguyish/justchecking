package mainapp;

import models.*;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        Engine carEngine = new Engine(4);
        Engine truckEngine = new Engine(4);
        Engine bikeEngine = new Engine(4);

        Car car = new Car("Honda Accord",5,50.0,carEngine,100);
        Truck truck = new Truck("GM Truck",5,100.0,truckEngine,75);
        MotorBike motorBike = new MotorBike("Suzuki Bike",5,50.0,bikeEngine,100);

        Vehicle[] vehicles = {car,truck,motorBike};

        ArrayList<DriveAble> drivableVehicles = new ArrayList<DriveAble>();

        drivableVehicles.add(car);
        drivableVehicles.add(truck);

        VehicleApp.printVehicleNamesAndPrices(vehicles);

        VehicleApp.getSpeedOfDrivableVehicles(drivableVehicles);

        System.out.println(car.totalBeforeTax(car));
        car.totalAfterTax(car);
        System.out.println(truck.totalBeforeTax(truck));
        truck.totalAfterTax(truck);

    }
}
