package isp.solution;

public class Robot implements Work {

	@Override
	public void startWork() {
		System.out.println("start working");
	}

	@Override
	public void stopWork() {
		System.out.println("stop working");
	}

}
