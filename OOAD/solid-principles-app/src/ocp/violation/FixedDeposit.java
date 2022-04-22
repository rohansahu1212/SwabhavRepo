package ocp.violation;

public class FixedDeposit {
	private String name;
	private double principal;
	private int duration;
	private FestivalType festival;

	public FixedDeposit(String name, double principal, int duration, FestivalType festival) {
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}

	public float calculateRate() {
		if (festival == FestivalType.NORMAL)
			return 7f;
		if (festival == FestivalType.NEW_YEAR)
			return 8f;
		if (festival == FestivalType.EID)
			return  9f;
		return 1f;
	}

	public double calculateSimpleInterest() {
		double interest = principal * calculateRate() * duration;
		return interest / 100.00 + principal;
	}
}
