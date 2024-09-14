package com.wgu.ecommerce.dao;

import com.wgu.ecommerce.entities.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Vacation", path = "vacations")
public interface VacationRepository extends JpaRepository<Vacation, Long> {
}
