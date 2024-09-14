package com.wgu.ecommerce.dao;

import com.wgu.ecommerce.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "Customer", path = "customers")
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
