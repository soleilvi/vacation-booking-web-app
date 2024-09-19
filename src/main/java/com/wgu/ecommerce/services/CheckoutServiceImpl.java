package com.wgu.ecommerce.services;

import com.wgu.ecommerce.dao.CustomerRepository;
import com.wgu.ecommerce.dto.Purchase;
import com.wgu.ecommerce.dto.PurchaseResponse;
import com.wgu.ecommerce.entities.Cart;
import com.wgu.ecommerce.entities.CartItem;
import com.wgu.ecommerce.entities.Customer;
import com.wgu.ecommerce.entities.StatusType;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private CustomerRepository customerRepository;

    @Autowired
    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {
        // retrieve the cart info from dto
        Cart cart = purchase.getCart();

        // generate tracking number
        String orderTrackingNumber = generateOrderTrackingNumber();
        cart.setOrderTrackingNumber(orderTrackingNumber);

        // populate cart with cartItems
        Set<CartItem> cartItems = purchase.getCartItems();
        cartItems.forEach(item -> cart.addCartItem(item));

        // populate customer with their cart
        Customer customer = purchase.getCustomer();
        customer.addCart(cart);

        // change cart status to ordered
        StatusType status = StatusType.ordered;
        cart.setStatus(status);

        // save to the database
        customerRepository.save(customer);

        // return a response
        return new PurchaseResponse(orderTrackingNumber);
    }

    // Generate a unique ID that is hard to guess and somewhat random (UUID)
    private String generateOrderTrackingNumber() {
        return UUID.randomUUID().toString();
    }
}
