package com.monocept.basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class InspectMetaDatatest {
	private void inspectData(Class className) {

		Method[] methClass = className.getDeclaredMethods();
		int count = 0;
		int noOfGetters = 0;
		int noOfSetters = 0;
		for (Method method : methClass) {
			System.out.println("name method in class " + className + " " + method);
			++count;
			String methodName = method.getName();
			if (methodName.startsWith("get")) {
				noOfGetters++;
			}
			if (methodName.startsWith("set")) {
				noOfSetters++;
			}
		}
		System.out.println("number of methods " + className + " " + count);
		count = 0;
		Constructor[] consClass = className.getConstructors();
		for (Constructor cons : consClass) {
			System.out.println("name name of constructor in " + className + " " + cons);
			count++;
		}
		System.out.println("number of constructor " + className + " " + count);
		System.out.println("number of getter in class " + className + " is " + noOfGetters);
		System.out.println("number of setter in class " + className + " is " + noOfSetters);

	}

	public static void main(String args[]) throws Exception {
		InspectMetaDatatest ob = new InspectMetaDatatest();
		ob.inspectData(String.class);
		// ob.inspectData(Object.class);
		// ob.inspectData(System.class);
	}
}
