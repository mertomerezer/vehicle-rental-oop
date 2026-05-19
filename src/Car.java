public class Car extends Vehicle{
    public Car(String brand, String model) {
        super(brand, model);
    }
    @Override
    double calculateRent(int days) {
        return days*100;
    }
}
