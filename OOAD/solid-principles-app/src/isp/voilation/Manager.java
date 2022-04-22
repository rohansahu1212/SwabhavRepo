package isp.voilation;

public class Manager implements Worker {

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
		System.out.println("Start eating");
	}

	@Override
	public void stopEat() {
		System.out.println("stop eating");
	}

}
