// File: Main.java
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.makePayment(150.00);

        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.makePayment(75.50);
    }
}
