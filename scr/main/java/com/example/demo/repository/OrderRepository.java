package com.example.demo.repository;

import com.example.demo.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private final List<Order> orders = new ArrayList<>();
    private Long nextOrderId = 1L;

    public Order getById(Long id) {
        for (Order order : orders) {
            if (order.getId().equals(id)) {
                return order;
            }
        }
        return null;
    }

    public List<Order> getAll() {
        return orders;
    }

    public Order addOrder(Order order) {
        order.setId(nextOrderId++);
        orders.add(order);
        return order;
    }

    public void updateOrder(Order updatedOrder) {
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getId().equals(updatedOrder.getId())) {
                orders.set(i, updatedOrder);
                return;
            }
        }
    }

    public void deleteOrder(Long id) {
        orders.removeIf(order -> order.getId().equals(id));
    }
}
