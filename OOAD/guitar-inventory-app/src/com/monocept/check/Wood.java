package com.monocept.check;

public enum Wood {
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY,
	 MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;
	 public String toString() {
		 if(this.equals(INDIAN_ROSEWOOD))
			 return "indian-records";
		 if(this.equals(BRAZILIAN_ROSEWOOD))
			 return "brazilan-record";
		 if(this.equals(MAHOGANY))
			 return "mahagony";
		 if(this.equals(MAPLE))
			 return "maple";
		 if(this.equals(COCOBOLO))
			 return "cobobolodo";
		 if(this.equals(CEDAR))
			 return "cedar";
		 if(this.equals(ADIRONDACK))
			 return "adirondack";
		 if(this.equals(ALDER))
			 return "alder";
		 if(this.equals(SITKA))
			 return "Sitka";
		 return "wood not found";
	 }
}
