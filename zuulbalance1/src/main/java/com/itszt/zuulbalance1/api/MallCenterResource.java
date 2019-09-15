package com.itszt.zuulbalance1.api;

import com.itszt.zuulbalance1.VO.OrderCenter;
import com.itszt.zuulbalance1.feign.IOrderProviderFeign;
import com.itszt.zuulbalance1.feign.IUserProviderFeign;
import com.itszt8.baseclouddemo.entities.Order;
import com.itszt8.baseclouddemo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MallCenterResource {

    @Autowired
    private IUserProviderFeign userProviderFeign;

    @Autowired
    private IOrderProviderFeign orderProviderFeign;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ordercenter2/{userId}")
    public OrderCenter getOrder2(@PathVariable("userId") String userId) {
        User user = restTemplate.getForObject("http://SPRING-CLOUD-ZUUL/user/user/"+ userId, User.class);
        Order order = restTemplate.getForObject("http://SPRING-CLOUD-ZUUL/order/order/"+ userId, Order.class);
        OrderCenter orderCenter = new OrderCenter();
        orderCenter.setOrder(order);
        orderCenter.setUser(user);
        return orderCenter;
    }

    @GetMapping("/ordercenter/{userId}")
    public OrderCenter getOrder(@PathVariable("userId") String userId) {
        User user = userProviderFeign.getUser(userId);
        Order order = orderProviderFeign.getOrder(userId);
        OrderCenter orderCenter = new OrderCenter();
        orderCenter.setOrder(order);
        orderCenter.setUser(user);
        return orderCenter;
    }
}
