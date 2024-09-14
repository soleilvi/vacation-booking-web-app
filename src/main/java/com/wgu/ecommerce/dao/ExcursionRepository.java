package com.wgu.ecommerce.dao;

import com.wgu.ecommerce.entities.Excursion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "Excursion", path = "excursions")
public interface ExcursionRepository extends JpaRepository<Excursion, Long> {
}
