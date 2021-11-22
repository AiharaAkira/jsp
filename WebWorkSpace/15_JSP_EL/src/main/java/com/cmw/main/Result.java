package com.cmw.main;

public class Result {
	String name;
	private double middle;
	private double last;
	private String avg2;
	private String grade;
	
	public Result(String name, double middle, double last, String avg2, String grade) {
		super();
		this.name = name;
		this.middle = middle;
		this.last = last;
		this.avg2 = avg2;
		this.grade = grade;
	}
	public double getMiddle() {
		return middle;
	}
	public void setMiddle(double middle) {
		this.middle = middle;
	}
	public double getLast() {
		return last;
	}
	public void setLast(double last) {
		this.last = last;
	}
	public String getAvg2() {
		return avg2;
	}
	public void setAvg2(String avg2) {
		this.avg2 = avg2;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Result() {
		// TODO Auto-generated constructor stub
	}
}
