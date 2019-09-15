package com.itszt8.orderprovider1.api;

import com.itszt8.baseclouddemo.entities.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderProviderResource {

    @GetMapping("/order/{userId}")
    public Order getOrder(@PathVariable("userId") String userId) {
        Order order = new Order();
        order.setDetail("detail -> " + userId);
        order.setId("order id -> " + userId);
        return order;
    }
}
