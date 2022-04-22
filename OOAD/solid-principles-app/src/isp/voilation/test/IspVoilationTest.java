package isp.voilation.test;

import isp.voilation.Manager;
import isp.voilation.Robot;
import isp.voilation.Worker;

public class IspVoilationTest {
	public static void main(String[] args) {
		Manager man = new Manager();
		atTheWorkStation(man);
		atTheCafeteria(man);

		Robot rob= new Robot();
		atTheWorkStation(rob);
		atTheCafeteria(rob);
	}

	private static void atTheWorkStation(Worker obj) {
		System.out.println("at the work sattion");
		obj.startWork();
		obj.stopWork();
		System.out.println();
	}

	private static void atTheCafeteria(Worker obj) {

		System.out.println("at the cafeteria");
		obj.startEat();
		obj.stopEat();
		System.out.println();
	}
}
