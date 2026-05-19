public class Motorcycle extends Vehicle{

    public Motorcycle(String brand, String model) {
        super(brand, model);
    }

    @Override
    double calculateRent(int days) {
        return days*50;
    }
}
