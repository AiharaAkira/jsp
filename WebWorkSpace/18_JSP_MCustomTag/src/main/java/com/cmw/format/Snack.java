package com.cmw.format;

import java.util.Date;

public class Snack {
	private String name;
	private int price;
	private Date d = new Date();
	
	public Snack() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Snack(String name, int price, Date d) {
		super();
		this.name = name;
		this.price = price;
		this.d = d;
	}


	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	
	
	
}
