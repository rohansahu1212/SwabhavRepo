package dip.voilation;

public class TaxCalculater {
	private LogType loggerType;

	public TaxCalculater(LogType loggerType) {

		this.loggerType = loggerType;
	}

	public int calculateTax(int amt, int rate) {
		int result;
		try {
			result = amt / rate;
			return result;
		} catch (Exception errMsg) {
			if (loggerType == LogType.DB) {
				DBLogger db = new DBLogger();
				db.log(errMsg.toString());
			}
			if (loggerType == loggerType.FILE) {
				FileLogger fl = new FileLogger();
				fl.log(errMsg.toString());
			}
			return -1;
		}

	}
}
