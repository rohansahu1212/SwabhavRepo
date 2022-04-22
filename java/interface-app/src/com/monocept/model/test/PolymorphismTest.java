package com.monocept.model.test;

import com.monocept.model.CustomerDb;
import com.monocept.model.DepartmentDb;
import com.monocept.model.FooChildDb;
import com.monocept.model.IDataAccessible;
import com.monocept.model.OrderDb;

public class PolymorphismTest {
	public static void main(String[] args) {
		doDbOperation(new CustomerDb());
		doDbOperation(new OrderDb());
		doDbOperation(new FooChildDb());
		doDbOperation(new DepartmentDb());
	}

	static void doDbOperation(IDataAccessible obj) {
		System.out.println("doing db operation");
		obj.create();
		obj.delete();
		obj.create();
		obj.read();
		System.out.println("------------------");
		System.out.println("");
	}
}
