package com.test.codes.compares;

public class Student implements Comparable<Student> {
	
	private int sId;
	private String sName;
	private String sAddress;
	public Student(int sId, String sName, String sAddress) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAddress = sAddress;
	}
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAddress=" + sAddress + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.sName.compareTo(o.sName);
	}
	
	
	
	

}
