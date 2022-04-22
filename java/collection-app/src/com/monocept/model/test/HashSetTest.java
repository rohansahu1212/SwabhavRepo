package com.monocept.model.test;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.monocept.model.LineItem;

public class HashSetTest {
	public static void main(String[] args) {
		Set<LineItem> set = new HashSet<LineItem>();
		set.add(new LineItem(101, "Maggi", 15, 50));
		set.add(new LineItem(101, "Maggi", 4, 40));
		set.add(new LineItem(122, "coffee", 5, 50));
		set.add(new LineItem(132, "tea", 5, 50));
//		for (Object obj : set) {
//			System.out.println("hash        "+obj.hashCode());
//		}
		for (Object obj : set) {
			LineItem li=(LineItem) obj;	
			System.out.println(li.getId());
			System.out.println(li.getName());
			System.out.println(li.getQuantity());
			System.out.println(li.getUnitPrice());
			System.out.println("-------------------------");
			li.calculateCost();
			}
//		System.out.println(set.hashCode());
		System.out.println(set.size());
		System.out.println(set);
	}

}
