package com.ibm.demo.services;

import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;
@Service
public class OrderService {
	public String createOrder(Order order) {
		return "order created";
	}
	

}
