public class Car extends Vehicle{
    public Car(String brand, String model, double dailyPrice) {
        super(brand, model, dailyPrice);
    }
    @Override
    double calculateRent(int days) {
        return days*100;
    }
}
