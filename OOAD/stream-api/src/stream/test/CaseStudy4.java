package stream.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import stream.model.Account;

public class CaseStudy4 {
	public static void main(String[] args) {
		Account accounts[] = { new Account(101, "rohan", 51000), new Account(102, "shikhar", 52000),
				new Account(103, "himanshu", 53000), new Account(104, "Vineet", 54000) };
		// Stream<Account> query = (Stream<Account>) accounts;

		Arrays.stream(accounts).filter(n -> n.getName().length() > 6).forEach(n -> {
			System.out.println(n.getName());
		});
		double sum = Arrays.stream(accounts).map(bal -> bal.getBalance()).reduce((double) 0, Double::sum);
		System.out.println(sum);
		
//		double sum1= Arrays.stream(accounts)
//	            .max(Comparator.comparingDouble(accounts::getbal))
//	            .orElseThrow(NoSuchElementException::new);
	}

}
