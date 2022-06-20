package com.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	OrderRepository repository;

	void insertOrder(OrderVO order) {
		repository.save(order);
	}
}
