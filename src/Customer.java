public class Customer {
    private int id;
    private String name;
    Vehicle rentedVehicle = null;


     public Customer(int id,String name,Vehicle rentedVehicle){
        this.id=id;
        this.name=name;
        this.rentedVehicle=rentedVehicle;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Vehicle getRentedVehicle() {
        return rentedVehicle;
    }

    public void setRentedVehicle(Vehicle rentedVehicle) {
        this.rentedVehicle = rentedVehicle;
    }
}
