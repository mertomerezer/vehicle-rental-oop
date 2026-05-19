public class Main {
    public static void main(String[] args) {

        Car c = new Car("BMW", "2018");
        Truck t = new Truck("New Holland", "2024");
        Motorcycle m = new Motorcycle("Yamaha", "2015");
        Customer a = new Customer(1, "Alex",c);

        RentalService rental = new RentalService();

        rental.car = c;
        rental.truck = t;
        rental.motorcycle = m;

        System.out.println("===Car Rent===");
        rental.rentCar(a, 3);

        System.out.println("\n=== RETURN VEHICLE ===");
        rental.returnVehicle(a);

        System.out.println("\n=== RENT AGAIN ===");
        rental.rentCar(a, 2);
    }
}