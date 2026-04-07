public class PayPalPayment extends Payment {
    private String email;
    private double amount;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.amount = amount;
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    @Override //
    public void processPayment() {
        System.out.println("Payment of $" + getAmount() + " confirmed using PayPal.");
    }
}