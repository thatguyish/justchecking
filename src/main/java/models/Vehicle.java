package models;

public abstract class Vehicle extends Product {
    private Integer qty;
    private Double price;
    private Engine engine;

    public int getSpeed() {
        return this.speed;
    }

    private int speed;
    private final double TAX = .15;

    public Double getPrice() {
        return this.price;
    }

    public Vehicle(String name, Integer qty, Double price, Engine engine, Integer speed) {
        super(name);
        this.qty = qty;
        this.price = price;
        this.engine = engine;
        this.speed = speed;
    }

    public double totalBeforeTax(Vehicle vehicle){
        return vehicle.price;
    }

    public Double calTax(Vehicle vehicle){
        return this.totalBeforeTax(vehicle) * this.TAX;
    }

    public abstract void totalAfterTax(Vehicle vehicle);

}
