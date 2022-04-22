package com.monocept.test;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

import com.monocept.model.Foo;
import com.monocept.model.IMathOperation;

public class MathOperationTest {
	public static void main(String[] args) {
//		IMathOperation x;
//
//		x = new IMathOperation() {
//
//			@Override
//			public Long doOperation(int a, int b) {
//
//				return (long) (a - b);
//			}
//		};
//		System.out.println(x.doOperation(12, 3));
//
//		x = (n1, n2) -> (long) n1 * n2;
//
//		System.out.println("Doing  multiplication " + x.doOperation(12, 3));
//		Foo f = new Foo();
//		x = f::doOperation;
//		System.out.println("Result using method referne " + x.doOperation(12, 12));

		Function<Integer, Boolean> bool;
		bool= MathOperationTest::checkEven;
		System.out.println(bool.apply(6));
		
//		IntPredicate ip;
//		ip=MathOperationTest::checkEven;
//		System.out.println(ip.test(55));
		
		IntPredicate ip= z->(z%2==0)?true:false;
		System.out.println(" using lembda "+ip.test(4));
		
		IntFunction<Integer> iff= num ->(num%2==0)?num*num*num:num;
		System.out.println("using lembda again "+iff.apply(12));
		
		
		
	}

	public static int cubeAnEventNo(int num) {
		if (num % 2 == 0)
			return (int) Math.pow(num, 3);
		return num;

	}

	public static boolean checkEven(int num) {
		if (num % 2 == 0)
			return true;
		return false;

	}

}
