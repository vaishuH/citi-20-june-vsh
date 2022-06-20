package com.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {
	@PostMapping
	public void createOrder() {
		System.out.println("working");
	}
	@GetMapping("/{id}")
	public Order getOrder(Integer id) {
		return new Order();
	}
}
