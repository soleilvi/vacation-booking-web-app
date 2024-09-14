package com.wgu.ecommerce.dao;

import com.wgu.ecommerce.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Country", path = "countries")
public interface CountryRepository extends JpaRepository<Country, Long> {
}
