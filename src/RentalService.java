public class RentalService {
    Car car;
    Truck truck;
    Motorcycle motorcycle;

    public void rentCar(Customer c,int days){
        if(car != null && !car.isRented() && c.getRentedVehicle() == null){

            double price = car.calculateRent(days);
            System.out.println("Price: " + price);

            car.setRented(true);
            c.setRentedVehicle(car);

        } else {
            System.out.println("Car cannot be rented");
        }
    }

    public void rentTruck(Customer c,int days){
        if(truck != null && !truck.isRented() && c.getRentedVehicle() == null){

            double price = truck.calculateRent(days);
            System.out.println("Price: " + price);

            truck.setRented(true);
            c.setRentedVehicle(truck);

        } else {
            System.out.println("Truck cannot be rented");
        }

    }

    public void rentMotorcycle(Customer c,int days){
        if(motorcycle != null && !motorcycle.isRented() && c.getRentedVehicle() == null){

            double price = motorcycle.calculateRent(days);
            System.out.println("Price: " + price);

            motorcycle.setRented(true);
            c.setRentedVehicle(motorcycle);

        } else {
            System.out.println("Motorcycle cannot be rented");
        }


    }



}
