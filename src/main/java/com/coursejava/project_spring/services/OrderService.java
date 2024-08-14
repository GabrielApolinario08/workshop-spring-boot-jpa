package com.coursejava.project_spring.services;

import com.coursejava.project_spring.entities.Order;
import com.coursejava.project_spring.entities.User;
import com.coursejava.project_spring.repositories.OrderRepository;
import com.coursejava.project_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
     public List<Order> findAll() {
         return orderRepository.findAll();
     }
     public Order findById(Long id) {
         Optional<Order> order = orderRepository.findById(id);
         return order.get();
     }
}
