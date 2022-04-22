package com.monocept.model;

import java.util.Objects;

public class LineItem {

	private int id;
	private String name;
	private int quantatiy;
	private double unitPrice;

	public int getId() {
		return id;

	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantatiy;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public LineItem(int id, String name, int quantity, double unitPrice) {
		this.name = name;
		this.id = id;
		this.quantatiy = quantity;
		this.unitPrice = unitPrice;
	}

	public void calculateCost() {
		System.out.println(quantatiy * unitPrice);
	}

//	@Override
//	  public int hashCode() {
//      int h =0;
//      h=id+name.hashCode();
//      return h;
//  }
	@Override
	public int hashCode() {
		return Objects.hash(name, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineItem other = (LineItem) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return ("name "+name+" id "+id+" quantity"+quantatiy+" Overall Cost");
	}
	

}
