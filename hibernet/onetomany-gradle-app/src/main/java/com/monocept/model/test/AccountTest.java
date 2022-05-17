package com.monocept.model.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.monocept.model.Account;
import com.monocept.model.Department;
import com.monocept.model.Employee;
import com.monocept.model.Transection;

public class AccountTest {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory facotry = cfg.configure().buildSessionFactory();
		System.out.println(facotry.getClass());

		Session session = facotry.openSession();
		System.out.println(session.getClass());

		Transaction txn = session.beginTransaction();
		System.out.println(txn.getClass());

	Account account= new Account("rohan", "pass", 3000.67);

		Transection txn1= new Transection(1,"with draw",200);
		txn1.setAccount(account);
		
		Transection txn2= new Transection(2,"deposite",200);
		txn2.setAccount(account);

		Transection txn3= new Transection(3,"deposite",2700);
		txn3.setAccount(account);
	
		Set<Transection> txns=new HashSet<Transection>();
		
		txns.add(txn1);
		txns.add(txn2);
		txns.add(txn3);
		
       account.setTransections(txns);

	
		session.save(account);

		txn.commit();
	}
}
