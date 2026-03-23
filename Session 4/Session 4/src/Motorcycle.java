/** Parent class this is the main class . */
class Vehicle {

    //atriboettt boet boet boett 
    protected String brand;
    protected String model;
    protected int year;

    /** Creates a vehicle object. */
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    /** @return brand, model, and year text */
    public String getBasicInfo() {
        return "Brand: " + brand + "\nModel: " + model + "\nYear: " + year;
    }
}

/** Child class: Motorcycle extends Vehicle. */
public class Motorcycle extends Vehicle {

    protected double price;

    /** Creates a motorcycle and calls parent constructor with super(...). */
    public Motorcycle(String brand, String model, int year, double price) {
        super(brand, model, year);
        this.price = price;
    }

    /** Prints inherited info plus motorcycle price. */
    public void displayInfo() {
        System.out.println(getBasicInfo());
        System.out.println("Price: $" + price);
    }
}