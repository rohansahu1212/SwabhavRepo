package ocp.solution.test;

import ocp.solution.FixedDeposit;
import ocp.solution.HoliFestivalRate;

public class OcpSolutionTest {
	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit("rohan", 700000, 10, new HoliFestivalRate());
		System.out.println(fd1.calculateSimpleInterest());

		FixedDeposit fd2 = new FixedDeposit("rohan", 700000, 10, () -> {
			System.out.println("its diwali ");
			return 11f;
		});
		System.out.println(fd2.calculateSimpleInterest());

		FixedDeposit fd3 = new FixedDeposit("rohan", 700000, 10, OcpSolutionTest::ramZanFestival);
		System.out.println(fd3.calculateSimpleInterest());
	}

	static float ramZanFestival() {
		System.out.println("Ramzan Season");
		return 12f;
	}
}
