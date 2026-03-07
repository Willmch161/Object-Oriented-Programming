import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        while (!sc.hasNextInt()) {
            System.out.print("Please enter an integer for width: ");
            sc.next();
        }
        int width = sc.nextInt();

        System.out.print("Enter height: ");
        while (!sc.hasNextInt()) {
            System.out.print("Please enter an integer for height: ");
            sc.next();
        }
        int height = sc.nextInt();

        if (width <= 0 || height <= 0) {
            System.out.println("Width and height must be positive integers.");
            sc.close();
            return;
        }

        Rectangle r = new Rectangle(width, height);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Rectangle Perimeter: " + (2 * (width + height)));

        sc.close();
    }
}
