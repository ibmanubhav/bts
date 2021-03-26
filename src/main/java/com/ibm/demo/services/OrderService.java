package com.ibm.demo.services;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;
import com.ibm.demo.repo.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderrepository;

	public String createOrder(Order order) {
		Order savedOrder = orderrepository.save(order);
		return savedOrder.getId();
	}

	public List<Order> getOrders() {
		return orderrepository.findAll();
	}

	public void updateOrder(Order order) {
		orderrepository.save(order);
	}

	public void deleteOrder(int orderId) {
		System.out.println("order deleted");
	}

	public Optional<Order> getOrder(String orderId) {
		return orderrepository.findById(orderId);
	}

}
