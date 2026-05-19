public class Motorcycle extends Vehicle{

    public Motorcycle(String brand, String model, double dailyPrice) {
        super(brand, model, dailyPrice);
    }

    @Override
    double calculateRent(int days) {
        return days*50;
    }
}
