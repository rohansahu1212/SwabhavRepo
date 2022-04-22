package dip.voilation.test;

import dip.voilation.LogType;
import dip.voilation.TaxCalculater;

public class DipVoilationTest {
	public static void main(String[] args) {
		TaxCalculater calc1 = new TaxCalculater(LogType.DB);
		System.out.println(calc1.calculateTax(10, 2));
		System.out.println(calc1.calculateTax(10, 0));

		TaxCalculater calc2 = new TaxCalculater(LogType.FILE);
		System.out.println(calc2.calculateTax(10, 5));
		System.out.println(calc2.calculateTax(10, 0));
	}
}
