package com.wgu.ecommerce.dao;

import com.wgu.ecommerce.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "CartItem", path = "cart-items")
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
