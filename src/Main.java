public class Main {
    public static void main(String[] args) {
        VehicleRentalService rentalService = new VehicleRentalService();

        // Rent a car with insurance for 7 days
        rentalService.rentVehicle("car", 7, true);

        // Rent a bike for 3 days
        rentalService.rentVehicle("bike", 3);

        // Rent a scooter with insurance for 5 days
        rentalService.rentVehicle("scooter", 5, true, "electric");
    }
}
