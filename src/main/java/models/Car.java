package models;

public class Car extends Vehicle implements DriveAble{

    public Car(String name, Integer qty, Double price, Engine engine, Integer speed) {
        super(name, qty, price, engine, speed);
    }

    @Override
    public Integer milesPerHour() {
        return this.getSpeed();
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {

    }
}
