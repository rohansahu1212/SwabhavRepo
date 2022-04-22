package com.monocept.model;

public class BmiCalculater {
	Person person;
	private float bmiScore;

	public BmiCalculater(Person person) {
		this.person = person;
		this.bmiScore=getBmiScore();

	}

	public String getBodyCategory() {
		//getBmiScore();
		if (bmiScore < 18.5)
			return "uderweight";
		if (bmiScore < 25)
			return "normal";
		if (bmiScore < 30)
			return "over weight";
		return "obersity";
	}

	private float getBmiScore() {
		float meterHeight=(float)(person.getHeight()*0.3048);
		bmiScore = (float) (person.getWeight() / Math.pow(meterHeight, 2));
		return bmiScore;
	}
	public float getBmi() {
		return bmiScore;
	}

	public String getDetails() {
		String details = person.getName() + " " + person.getHeight() + " " + person.getWeight() + " "+getBmi()+" "+getBodyCategory();
		return details;
	}

}
