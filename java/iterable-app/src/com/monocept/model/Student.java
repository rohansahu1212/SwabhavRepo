package com.monocept.model;

public class Student implements Comparable<Student> {
	private String firstName;
	private String lastName;
	private int rollNo;
	private double cgpa;
	private int standard;

	public Student(String firtName, String lastName, int rollNo, double cgpa, int standard) {
		this.firstName = firtName;
		this.lastName = lastName;
		this.rollNo = rollNo;
		this.cgpa = cgpa;
		this.standard = standard;

	}

	public String getFirstName() {
		return firstName;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + rollNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equalsIgnoreCase(other.firstName))
			return false;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	@Override
	public int compareTo(Student o) {
		if(this.rollNo-o.rollNo>0)
			return 1;
		if(this.rollNo-o.rollNo<0)
			return -1;	
		return 1;
	}
//	@Override
//	public int compareTo(Student o) {
//		if((this.firstName.compareTo(o.firstName))>0)
//			return 1;
//		if((this.firstName.compareTo(o.firstName))<0)
//			return -1;	
//		return 0;
//	}


}
