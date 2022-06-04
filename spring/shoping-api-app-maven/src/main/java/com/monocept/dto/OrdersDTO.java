package com.monocept.dto;

import javax.persistence.Entity;
import javax.persistence.Id;


public class OrdersDTO {
	
	private int oid;
	private String orderName;

	public OrdersDTO() {

	}

	public OrdersDTO(int oid, String orderName) {

		this.oid = oid;
		this.orderName = orderName;
	}

	public int getOid() {
		return oid;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	

}
