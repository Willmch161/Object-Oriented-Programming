public class CryptoPayment extends Payment {
    private String walletAddress;
    private double amount;

    public CryptoPayment(double amount, String walletAddress) {
        super(amount);
        this.amount = amount;
        this.walletAddress = walletAddress;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public void processPayment() {
        System.out.println("Payment of $" + getAmount() + " confirmed using Cryptocurrency.");
    }
}
