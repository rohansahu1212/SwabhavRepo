package dip.solution;

public class TaxCalculater {
	private ILogger log;

	public TaxCalculater(ILogger log) {
		this.log = log;
	}

	public int calculateTax(int amt, int rate) {
		int result;
		try {
			result = amt / rate;
			return result;
		} catch (Exception errMsg) {
			log.logDetails(errMsg.toString());

			return -1;
		}

	}

}
