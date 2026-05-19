public class Truck extends Vehicle{

    public Truck(String brand, String model) {
        super(brand, model);
    }

    @Override
    double calculateRent(int days) {
        return days*200;
    }
}
