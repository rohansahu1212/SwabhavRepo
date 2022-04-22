package com.monocept.test;

import java.util.List;

import com.monocept.model.Customer;
import com.monocept.model.LineItem;
import com.monocept.model.Order;
import com.monocept.model.Product;

public class ShoppingCartTest {
	public static void main(String[] args) {

		System.out.println("adding product and testing----------------------");
		Product pro1 = new Product(11, "oil", 200, 20);
		Product pro2 = new Product(12, "milk", 200, 20);
		new ProductTest().productTest(pro1);
		new ProductTest().productTest(pro2);

		System.out.println("adding line items and testing----------------------");
		LineItem li1 = new LineItem(111, 2, pro1);
		LineItem li2 = new LineItem(112, 3, pro2);
		new LineItemTest().lineItemTest(li1);
		new LineItemTest().lineItemTest(li2);

		System.out.println("adding order and testing -------------------------");
		Order or1 = new Order(101, "rohan order");
		new OrderTest().orderTest(or1);
		or1.addItem(li1);
		or1.addItem(li2);
		new OrderTest().orderTest(or1);

		System.out.println("adding customer and testing -------------------------");
		Customer cus = new Customer(12, "rohan");
		cus.addOrder(or1);
		new CustomerTest().test(cus);
		printDetails(cus);
	}

	private static void printDetails(Customer cus) {
		System.out.println("Printing details ============================================");
		System.out.println("Customer id " + cus.getId());
		System.out.println("Custmer name " + cus.getName());
		System.out.println("Custmer order count " + cus.getOrderCount());
		System.out.println("Order Details----------");
		for (Order or : cus.getOrders()) {
			printDetials(or);
		}

	}

	private static void printDetials(Order or) {
		System.out.println("Order ID " + or.getId());
		System.out.println("Order Data " + or.getData());
		System.out.println("Order Checkout Price " + or.checkoutPrice());
		for (LineItem li : or.getItems()) {
			printDetials(li);
		}
		System.out.println("Order Checkout Price " + or.checkoutPrice());
		System.out.println("thanks for shopping ..... com again soon");
	}

	private static void printDetials(LineItem li) {
		System.out.println("Line Item id " + li.getId());
		System.out.println("Line Item Quantity" + li.getQuantity());
		System.out.println("Line Item cost " + li.calculateCost());
		Product pro = li.getProduct();
		printDetials(pro);
	}

	private static void printDetials(Product pro) {
		System.out.println("Product Details");
		System.out.println("Product ID "+pro.getId());
		System.out.println("Product Name "+pro.getName());
		System.out.println("Product Price "+pro.getPrice());
		System.out.println("Product Discount "+pro.getDiscount());
		System.out.println("Product Price After Discount "+pro.calculatePriceAfterDiscout());
	}
}
//Customer cus=new Customer(101,"rohan");
//Product pr=new Product(101,"almond",100, 20);
//LineItem li= new LineItem(1,2,pr);
//Order or=new Order(1101, "VIjayorder");
//cus.addOrder(or);
//Customer cus=new Customer(101,"rohan");
//CustomerTest ct=new CustomerTest();
//ct.test(cus);
//Order order=new Order(101,"brick");
//cus.addOrder(order);
//ct.test(cus);