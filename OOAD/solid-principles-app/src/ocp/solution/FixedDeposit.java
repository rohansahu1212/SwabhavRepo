package ocp.solution;

import ocp.violation.FestivalType;

public class FixedDeposit {
	private String name;
	private double principal;
	private int duration;
	private IFestivalRate festival;

	public FixedDeposit(String name, double principal, int duration, IFestivalRate festival) {
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}

	public String getName() {
		return name;
	}

	public double getPrincipal() {
		return principal;
	}

	public int getDuration() {
		return duration;
	}

	public IFestivalRate getFestival() {
		return festival;
	}

	public double calculateSimpleInterest() {
		double interest = principal * festival.calculateRate() * duration;
		return interest / 100.00 + principal;
	}
}
