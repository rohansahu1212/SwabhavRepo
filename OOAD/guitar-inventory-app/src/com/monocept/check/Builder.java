package com.monocept.check;

public enum Builder {
	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

	public String toString() {
		if(this.equals(ANY))
			return "any";
		if(this.equals(PRS))
			return "PRS";
		if(this.equals(RYAN))
			return "ryan";
		if(this.equals(OLSON))
			return "olson";
		if(this.equals(COLLINGS))
			return "collings";
		if(this.equals(GIBSON))
			return "gibson";
		if(this.equals(MARTIN))
			return "martin";
		if(this.equals(FENDER))
			return "fender";
		return null;
	}
}
