package com.monocept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.dto.OrdersDTO;
import com.monocept.model.Orders;
import com.monocept.repository.SOrderRepository;

@Service
public class SOrderService {
	@Autowired
	SOrderRepository repo;

	public SOrderService() {
		System.out.println("order serive created");
	}

	public void addOrder(int id, OrdersDTO orderDTO) {
		repo.addOrder(id, orderDTO);
	}

	public List<Orders> getAllOrder() {
		return repo.getAllOrder();
	}

	public Orders getSingleOrder(int oid) {
		return repo.getSingleOrder(oid);
	}

}
