public class Main {
    public static void main(String[] args) {
        Motorcycle basicBike = new Motorcycle("Honda", "CBR150R", 2022, 2500.00);
        SportMotorcycle sportBike = new SportMotorcycle("Yamaha", "R1", 2024, 18500.00, 299);

        System.out.println("=== Motorcycle ===");
        basicBike.displayInfo();

        System.out.println("\n=== Sport Motorcycle ===");
        sportBike.displayInfo();
    }
}
