// File: CustomerService.java
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void printCustomerById(int id) {
        Customer customer = customerRepository.findCustomerById(id);
        if (customer != null) {
            System.out.println("Customer Found: " + customer);
        } else {
            System.out.println("Customer not found with ID: " + id);
        }
    }
}
