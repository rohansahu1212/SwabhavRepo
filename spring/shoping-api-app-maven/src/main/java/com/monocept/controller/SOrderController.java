package com.monocept.controller;

import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.dto.OrdersDTO;
import com.monocept.model.Orders;
import com.monocept.service.SOrderService;

@RestController
@RequestMapping(path = "api/v1/order")
public class SOrderController {

	@Autowired
	SOrderService orderService;

	@GetMapping(path = "all")
	public ResponseEntity<List<Orders>> getAllOrder() {
		return ResponseEntity.ok(orderService.getAllOrder());
	}

	@GetMapping(path = "singleOrder/{oid}")
	public ResponseEntity<Orders> getSingleOrder(@PathVariable("oid") String oid) {
		return ResponseEntity.ok(orderService.getSingleOrder(Integer.valueOf(oid)));
	}

	@PostMapping(path = "add/{cid}")
	public ResponseEntity<OrdersDTO> addOrder(@PathVariable("cid") String cid,@RequestBody OrdersDTO order) {
		orderService.addOrder(Integer.valueOf(cid), order);
		return ResponseEntity.ok(order);
	}

}
