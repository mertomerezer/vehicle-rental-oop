abstract class Vehicle {
    protected String brand;
    protected String model;
    protected double dailyPrice;
    protected boolean isRented;

    abstract double calculateRent(int days);
}
