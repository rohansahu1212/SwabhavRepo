package dip.solution.test;

import dip.solution.DBLogger;
import dip.solution.FileLogger;
import dip.solution.TaxCalculater;

public class DipSolutionTest {
	public static void main(String[] args) {
		TaxCalculater calc1 = new TaxCalculater(new DBLogger());
		System.out.println(calc1.calculateTax(10, 2));
		System.out.println(calc1.calculateTax(10, 0));

		TaxCalculater calc2 = new TaxCalculater(new FileLogger());
		System.out.println(calc2.calculateTax(10, 5));
		System.out.println(calc2.calculateTax(10, 0));

		TaxCalculater calc3 = new TaxCalculater((String errMsg) -> {
			System.out.println("error found");
		});

		System.out.println(calc3.calculateTax(10, 0));

		TaxCalculater calc4 = new TaxCalculater(DipSolutionTest::log);
		System.out.println(calc4.calculateTax(12, 0));

	}

	private static void log(String errMsg) {
		System.out.println("using Refernace " + errMsg);
	}
}
