package in.zeusonline.spring6restmvc.services;

import in.zeusonline.spring6restmvc.model.Customer;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {

    public Map<UUID, Customer> customerMap;

    public CustomerServiceImpl() {
        this.customerMap = new HashMap<>();

        Customer customer1 = Customer.builder()
                .id(UUID.randomUUID())
                .name("Amit")
                .build();

        Customer customer2 = Customer.builder()
                .id(UUID.randomUUID())
                .name("Zeus")
                .build();

        Customer customer3 = Customer.builder()
                .id(UUID.randomUUID())
                .name("Firsla")
                .build();

        customerMap.put(customer1.getId(), customer1);
        customerMap.put(customer2.getId(), customer2);
        customerMap.put(customer3.getId(), customer3);

    }

    @Override
    public Customer getCustomerById(UUID id) {
        return customerMap.get(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customerMap.values());
    }
}
