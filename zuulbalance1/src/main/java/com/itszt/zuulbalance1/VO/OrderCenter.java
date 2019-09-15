package com.itszt.zuulbalance1.VO;

import com.itszt8.baseclouddemo.entities.Order;
import com.itszt8.baseclouddemo.entities.User;

public class OrderCenter {
    private User user;
    private Order order;

    public OrderCenter() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
