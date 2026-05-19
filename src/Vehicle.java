abstract class Vehicle {

    protected String brand;
    protected String model;
    protected double dailyPrice;
    protected boolean isRented;

    public Vehicle(String brand, String model, double dailyPrice) {
        this.brand = brand;
        this.model = model;
        this.dailyPrice = dailyPrice;
        this.isRented = false;
    }

    abstract double calculateRent(int days);

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        this.isRented = rented;
    }
}