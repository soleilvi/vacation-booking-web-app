package com.wgu.ecommerce.bootstrap;

import com.wgu.ecommerce.dao.CustomerRepository;
import com.wgu.ecommerce.dao.DivisionRepository;
import com.wgu.ecommerce.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private CustomerRepository customerRepository;

    private DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in BootStrap");

        // Populate database with 5 customers if John Doe is the only one there
        if (customerRepository.count() == 1) {
            Customer customer1 = new Customer("Michael", "Scott", "123 Address St",
                                    "12345", "111 111 1111", divisionRepository.findById(37L).get());
            Customer customer2 = new Customer("Pam", "Beesly", "456 Road St",
                                    "23456", "222 222 2222", divisionRepository.findById(37L).get());
            Customer customer3 = new Customer("Dwight", "Schrute", "789 Street St",
                                    "34567", "333 333 3333", divisionRepository.findById(37L).get());
            Customer customer4 = new Customer("Jim", "Halpert", "111 Somewhere St",
                                    "45678", "444 444 4444", divisionRepository.findById(6L).get());
            Customer customer5 = new Customer("Ryan", "Howard", "222 Final St",
                                    "56789", "555 555 5555", divisionRepository.findById(31L).get());

            customerRepository.save(customer1);
            customerRepository.save(customer2);
            customerRepository.save(customer3);
            customerRepository.save(customer4);
            customerRepository.save(customer5);

            System.out.println("Added 5 customers");
        }

        System.out.println("Number of customers: " + customerRepository.count());
    }
}
