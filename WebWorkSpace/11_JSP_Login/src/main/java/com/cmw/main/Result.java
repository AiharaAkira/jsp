package com.cmw.main;

public class Result {
	
	private String name;
	private String id;
	private String pw;
	private String pwOk;
	
	public Result() {
		// TODO Auto-generated constructor stub
	}

	public Result(String name, String id, String pw, String pwOk) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.pwOk = pwOk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPwOk() {
		return pwOk;
	}

	public void setPwOk(String pwOk) {
		this.pwOk = pwOk;
	}
	
	

	
	

}
