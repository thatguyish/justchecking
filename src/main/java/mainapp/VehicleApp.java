package mainapp;

import models.DriveAble;
import models.Vehicle;

import java.util.ArrayList;

public class VehicleApp {
    public static void printVehicleNamesAndPrices(Vehicle[] vehicles){
        for (Vehicle vehicle: vehicles){
            System.out.printf("%s: costs: %.2f, ",vehicle.getName(),vehicle.getPrice());
        }
    }

    public static void getSpeedOfDrivableVehicles(ArrayList<DriveAble> drivableCars){
        for (DriveAble vehicle: drivableCars){
            System.out.println(vehicle.milesPerHour()+" ");
        }
    }

    public static void sortAndPrintDrivableVehiclesBySpeed(ArrayList<DriveAble> drivable){

    }
}
