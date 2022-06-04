package com.monocept.model.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.monocept.model.Customer;
import com.monocept.model.LineItem;
import com.monocept.model.SOrder;
import com.monocept.model.Product;

public class ShoppingTest {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory facotry = cfg.configure().buildSessionFactory();
		System.out.println(facotry.getClass());

		Session session = facotry.openSession();
		System.out.println(session.getClass());

		Transaction txn = session.beginTransaction();
		System.out.println(txn.getClass());

		Customer cus1 = new Customer(102, "rohansahu");

		SOrder or1 = new SOrder(112, "rohan list");

		Product pr1 = new Product(112, "dahi", 400, 23);

		LineItem item1 = new LineItem(102, 12);
		item1.setOrder(or1);
		item1.setProduct(pr1);

		or1.setCustomer(cus1);
		or1.addLineItem(item1);

		cus1.addOrder(or1);

		session.save(cus1);
		session.save(pr1);

		txn.commit();

		System.out.println("end of main");
	}
}
