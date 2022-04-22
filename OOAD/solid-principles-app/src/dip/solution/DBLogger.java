package dip.solution;

public class DBLogger implements ILogger{
	@Override
	public void logDetails(String errMsg) {
		System.out.println("DB log Error message solution " + errMsg);
	}
}
