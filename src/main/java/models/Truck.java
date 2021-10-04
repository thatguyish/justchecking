package models;

public class Truck extends Vehicle implements DriveAble{
    public final double TAX = .2;


    public Truck(String name, Integer qty, Double price, Engine engine, Integer speed) {
        super(name, qty, price, engine, speed);
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {
        System.out.println(vehicle.calTax(vehicle)+vehicle.getPrice());
    }

    @Override
    public double totalBeforeTax(Vehicle vehicle) {
        return super.totalBeforeTax(vehicle);
    }

    @Override
    public Integer milesPerHour() {
        return this.getSpeed();
    }
}
