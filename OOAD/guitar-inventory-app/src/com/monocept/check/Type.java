package com.monocept.check;

public enum Type {
	ACOUSTIC, ELECTRIC;

	@SuppressWarnings("incomplete-switch")
	public String toString() {
		if (this.equals(ACOUSTIC))
			return "acoustic";
		if (this.equals(ELECTRIC))
			return "Electric";
		return "not found";
	}
}
