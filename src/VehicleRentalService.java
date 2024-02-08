public class VehicleRentalService {

    // Method to rent a car
    public void rentVehicle(String vehicleType, int rentalDuration, boolean includeInsurance) {
        // Logic to rent a car
        System.out.println("Renting a " + vehicleType + " for " + rentalDuration + " days.");
        if (includeInsurance) {
            System.out.println("Insurance included.");
        } else {
            System.out.println("Insurance not included.");
        }

    }

    // Method to rent a bike
    public void rentVehicle(String vehicleType, int rentalDuration) {
        // Logic to rent a bike
        System.out.println("Renting a " + vehicleType + " for " + rentalDuration + " days.");

    }

    // Method to rent a scooter
    public void rentVehicle(String vehicleType, int rentalDuration, boolean includeInsurance, String scooterType) {
        // Logic to rent a scooter
        System.out.println("Renting a " + scooterType + " " + vehicleType + " for " + rentalDuration + " days.");
        if (includeInsurance) {
            System.out.println("Insurance included.");
        } else {
            System.out.println("Insurance not included.");
        }

    }
}
