package stream.test;

import java.util.Arrays;
import java.util.stream.Stream;

public class CaseStudy2 {
	public static void main(String[] args) {
		String[] names = { "vishak", "mary", "aditi", "vineet" };

		Stream<String> sortedNamesStream=Arrays.stream(names)
				.filter(CaseStudy2::namesWithA)//n->n.toLowerCase().contains("a"))
				.sorted((n1,n2)->n2.compareTo(n1))
				.map(CaseStudy2::nameShort);
		
				sortedNamesStream.forEach(name->System.out.println(name.toUpperCase()));
				
		//		sortedNamesStream.forEach(name->System.out.println(name.toUpperCase()));
		
	}
	static String nameShort(String name) {
		return name.substring(0,4);
	}
	
	static int sortTheNames(String n1,String n2) {
		return n2.compareTo(n1);
	} 
	static Boolean namesWithA(String name) {
		return name.toLowerCase().contains("a");
	}
}
