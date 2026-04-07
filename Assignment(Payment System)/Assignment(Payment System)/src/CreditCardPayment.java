public class CreditCardPayment extends PaymentSystem {
    private String cardNumber;
    private String cardHolder;

    public CreditCardPayment(double amount, String cardNumber, String cardHolder) {
        super(amount); // Inherits amount from Payment
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void processPayment() {
        System.out.println("Payment of $" + getAmount() + " confirmed using Credit Card.");
    }
}