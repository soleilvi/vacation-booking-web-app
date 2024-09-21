package com.wgu.ecommerce.services;

import com.wgu.ecommerce.dto.Purchase;
import com.wgu.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
