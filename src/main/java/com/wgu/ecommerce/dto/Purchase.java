package com.wgu.ecommerce.dto;

import com.wgu.ecommerce.entities.Cart;
import com.wgu.ecommerce.entities.CartItem;
import com.wgu.ecommerce.entities.Customer;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Cart cart;

    private Set<CartItem> cartItems;
}
