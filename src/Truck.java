public class Truck extends Vehicle{

    public Truck(String brand, String model, double dailyPrice) {
        super(brand, model, dailyPrice);
    }

    @Override
    double calculateRent(int days) {
        return days*200;
    }
}
