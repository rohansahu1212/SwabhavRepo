package stream.test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayStreamTest {
	
	public static void main(String[] args) {
		
		String[] names = { "vishak", "mary", "aditi" };

		Arrays.stream(names).forEach(n -> System.out.println(n));

		System.out.println("------------------------------------");

		Arrays.stream(names).forEach(ArrayStreamTest::printDetails);

		System.out.println("------------------------------------");

		Arrays.stream(names).forEach(System.out::println);
	}

	static void printDetails(String name) {
		System.out.println(name);
	}
}
