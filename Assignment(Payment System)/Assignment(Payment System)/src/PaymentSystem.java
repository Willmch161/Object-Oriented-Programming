import java.util.ArrayList;

abstract class Payment {
    protected double amount;
    
    public Payment(double amount) {
        this.amount = amount;
    }
    
    abstract void processPayment();
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardholderName;
    
    public CreditCardPayment(double amount, String cardNumber, String cardholderName) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardholderName = cardholderName;
    }
    
    @Override
    void processPayment() {
        System.out.println("Processing credit card payment of $" + amount + " for " + cardholderName);
    }
}

class PayPalPayment extends Payment {
    private String email;
    
    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }
    
    @Override
    void processPayment() {
        System.out.println("Processing PayPal payment of $" + amount + " to " + email);
    }
}

class CryptoPayment extends Payment {
    private String walletAddress;
    
    public CryptoPayment(double amount, String walletAddress) {
        super(amount);
        this.walletAddress = walletAddress;
    }
    
    @Override
    void processPayment() {
        System.out.println("Processing crypto payment of " + amount + " to " + walletAddress);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        // Requirement: Store different payment types in an ArrayList 
        ArrayList<Payment> payment = new ArrayList<>();

        // Requirement: Instantiate child classes [cite: 25, 26]
        payment.add(new CreditCardPayment(100.0, "4111-XXXX", "Alice Smith"));
        payment.add(new PayPalPayment(45.50, "alice@example.com"));
        payment.add(new CryptoPayment(0.0012, "0x71C..."));

        // Requirement: Use a loop to process all payments [cite: 24]
        for (Payment p : payment) {
            p.processPayment(); 
        }   
    }
}