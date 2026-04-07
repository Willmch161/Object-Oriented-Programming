import java.util.ArrayList; // [cite: 1, 2, 3]

public class Main {
    public static void main(String[] args) {
        
        ArrayList<PaymentSystem> payments = new ArrayList<>(); // [cite: 23]
        
        // [cite: 25, 26]
        PaymentSystem p1 = new CreditCardPayment(150.50, "1234-5678-9012-3456", "John Doe"); 
        PaymentSystem p2 = new PayPalPayment(75.00, "johndoe@example.com");

        payments.add(p1);
        payments.add(p2);

        System.out.println("--- Payment Processing System ---");
        
        for (PaymentSystem payment : payments) { // [cite: 24]
            payment.processPayment();
        }
    }
}