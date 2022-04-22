package isp.solution.test;

import isp.solution.Eat;
import isp.solution.Manger;
import isp.solution.Robot;
import isp.solution.Work;

public class IspSolutionTest {
	public static void main(String[] args) {
		Manger man = new Manger();
		atTheCafeteria(man);
		atTheWorkStation(man);

		Robot rob = new Robot();
		atTheWorkStation(rob);
		//atTheCafeteria(rob); // this line giving error still
	}

	private static void atTheWorkStation(Work obj) {
		System.out.println("at the work sattion");
		obj.startWork();
		obj.stopWork();
		System.out.println();
	}

	private static void atTheCafeteria(Eat obj) {

		System.out.println("at the cafeteria");
		obj.startEat();
		obj.stopEat();
		System.out.println();
	}
}
