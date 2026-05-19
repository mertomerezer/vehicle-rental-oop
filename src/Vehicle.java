abstract class Vehicle {

    protected String brand;
    protected String model;

    protected boolean isRented;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
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