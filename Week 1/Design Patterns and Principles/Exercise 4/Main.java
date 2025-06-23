// File: Main.java
public class Main {
    public static void main(String[] args) {
    
        PayPalGateway paypal = new PayPalGateway();
        PaymentProcessor paypalAdapter = new PayPalAdapter(paypal);
        paypalAdapter.processPayment(250.00);

        StripeGateway stripe = new StripeGateway();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);
        stripeAdapter.processPayment(500.00);
    }
}
