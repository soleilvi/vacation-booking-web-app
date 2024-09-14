package com.wgu.ecommerce.dao;

import com.wgu.ecommerce.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Customer", path = "customers")
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
