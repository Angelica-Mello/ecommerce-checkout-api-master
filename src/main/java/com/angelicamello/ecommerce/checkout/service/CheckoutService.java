package com.angelicamello.ecommerce.checkout.service;

import com.angelicamello.ecommerce.checkout.entity.CheckoutEntity;
import com.angelicamello.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
