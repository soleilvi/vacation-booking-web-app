package com.dto;

import com.wgu.ecommerce.dto.Purchase;
import com.wgu.ecommerce.entities.CartItem;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class PurchaseTest {
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();
    Purchase purchase;

    @BeforeEach
    void setUp() {
        purchase = new Purchase();
    }

    @Test
    public void whenNotCartEmpty_NoConstraintViolations() {
        // Add a new item into purchase's cartItem set
        purchase.setCartItems(new HashSet<>());
        purchase.getCartItems().add(new CartItem());

        // Add the violations we get when we test purchase into a set
        Set<ConstraintViolation<Purchase>> violations = validator.validate(purchase);

        // Check if the number of violations generated is the one we expect
        assertEquals(0, violations.size());
    }

    @Test
    public void whenCartEmpty_OneConstraintViolation() {
        purchase.setCartItems(new HashSet<>());
        Set<ConstraintViolation<Purchase>> violations = validator.validate(purchase);
        System.out.println(violations);

        assertEquals(1, violations.size());
    }
}
