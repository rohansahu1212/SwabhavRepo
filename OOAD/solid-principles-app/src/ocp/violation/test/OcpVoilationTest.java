package ocp.violation.test;

import ocp.violation.FestivalType;
import ocp.violation.FixedDeposit;

public class OcpVoilationTest {
	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit("rohan", 100000, 10, FestivalType.NEW_YEAR);
        System.out.println(fd1.calculateSimpleInterest());
	}
}
