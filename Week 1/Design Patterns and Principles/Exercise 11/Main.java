// File: Main.java
public class Main {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);
        service.printCustomerById(1);
        service.printCustomerById(2);
        service.printCustomerById(3); 
    }
}
