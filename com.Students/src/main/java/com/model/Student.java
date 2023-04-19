package com.model;



public class Student {
	
	private int Sid;
	private String Sname;
	private String Scity;
	private Double Spercentage;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getScity() {
		return Scity;
	}
	public void setScity(String scity) {
		Scity = scity;
	}
	public Double getSpercentage() {
		return Spercentage;
	}
	public void setSpercentage(Double spercentage) {
		Spercentage = spercentage;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Scity=" + Scity + ", Spercentage=" + Spercentage + "]";
	}
	
}
