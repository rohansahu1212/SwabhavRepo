package dip.solution;

public class FileLogger implements ILogger {
	@Override
	public void logDetails(String errMsg) {
		System.out.println("file log error message " + errMsg);
	}
}
