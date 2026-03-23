/** Child class file: SportMotorcycle extends Motorcycle. */
public class SportMotorcycle extends Motorcycle {

    private int topSpeed;

    public SportMotorcycle(String brand, String model, int year, double price, int topSpeed) {
        super(brand, model, year, price);
        this.topSpeed = topSpeed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }
}
