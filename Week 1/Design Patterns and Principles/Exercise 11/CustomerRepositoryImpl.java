// File: CustomerRepositoryImpl.java
import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, Customer> customerDatabase = new HashMap<>();

    public CustomerRepositoryImpl() {
        
        customerDatabase.put(1, new Customer(1, "Maria"));
        customerDatabase.put(2, new Customer(2, "Michael"));
    }

    @Override
    public Customer findCustomerById(int id) {
        return customerDatabase.get(id);
    }
}
