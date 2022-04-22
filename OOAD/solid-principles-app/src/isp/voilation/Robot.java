package isp.voilation;

import javax.management.RuntimeErrorException;

public class Robot implements Worker {
	@Override
	public void startWork() {
		System.out.println("started workinh");

	}

	@Override
	public void stopWork() {
		System.out.println("stop working");
	}

	@Override
	public void startEat() {
		throw new RuntimeException("robot can't eat");
	}

	@Override
	public void stopEat() {
		throw new RuntimeException("robot can't eat");
	}

}
