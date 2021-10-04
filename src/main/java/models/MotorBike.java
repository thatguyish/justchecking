package models;

public class MotorBike extends Vehicle{
    private Integer numberOfWheels;

    public MotorBike(String name, Integer qty, Double price, Engine engine, Integer speed) {
        super(name, qty, price, engine, speed);
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {
        System.out.println(vehicle.calTax(vehicle)+ vehicle.getPrice());
    }


}
