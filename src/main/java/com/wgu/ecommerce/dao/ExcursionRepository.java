package com.wgu.ecommerce.dao;

import com.wgu.ecommerce.entities.Excursion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Excursion", path = "excursions")
public interface ExcursionRepository extends JpaRepository<Excursion, Long> {
}
