package com.ibm.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo.entity.Order;
import com.ibm.demo.services.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService orderService;

	@PostMapping("/order")
	String createOrder(@RequestBody @Validated Order order, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			throw new IllegalArgumentException("Something went wrong");
		}
		System.out.println(order);
		return orderService.createOrder(order);

	}

	@GetMapping("/order")
	String getOrder() {
		return "Order is Creater";
	}

	@PutMapping("/order/{id}")
	String updateOrder(@PathVariable("id") int orderId) {
		System.out.println(orderId);
		return "Order updated";
	}

	@DeleteMapping("/order/{id}")
	String deleteOrder(@PathVariable("id") int orderId) {
		System.out.println(orderId);
		return "Order Deleted";
	}

}
