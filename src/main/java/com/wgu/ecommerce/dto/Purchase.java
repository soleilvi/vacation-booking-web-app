package com.wgu.ecommerce.dto;

import com.wgu.ecommerce.entities.Cart;
import com.wgu.ecommerce.entities.CartItem;
import com.wgu.ecommerce.entities.Customer;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Cart cart;

    @NotEmpty(message = "Cart is empty, please add an item before checking out.")
    private Set<CartItem> cartItems;
}
